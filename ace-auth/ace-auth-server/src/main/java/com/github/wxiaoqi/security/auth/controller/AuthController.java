package com.github.wxiaoqi.security.auth.controller;

import com.alibaba.fastjson.JSON;
import com.github.wxiaoqi.security.api.vo.user.UserInfo;
import com.github.wxiaoqi.security.auth.configuration.KeyConfiguration;
import com.github.wxiaoqi.security.auth.service.AuthService;
import com.github.wxiaoqi.security.auth.util.client.TokenString;
import com.github.wxiaoqi.security.auth.util.user.JwtAuthenticationRequest;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("jwt")
@Slf4j
public class AuthController {
	@Value("${jwt.token-header}")
	private String tokenHeader;

	@Autowired
	private AuthService authService;
	
	@Autowired
	private KeyConfiguration keyConfiguration;

	@RequestMapping(value = "token", method = RequestMethod.POST)
	public ObjectRestResponse<String> createAuthenticationToken(
			@RequestBody JwtAuthenticationRequest authenticationRequest) throws Exception {
		log.info(authenticationRequest.getUsername() + " require logging...");
		final String token = authService.login(authenticationRequest);
		return new ObjectRestResponse<>().data(token);
	}

	@RequestMapping(value = "refresh", method = RequestMethod.GET)
	public ObjectRestResponse<String> refreshAndGetAuthenticationToken(HttpServletRequest request) throws Exception {
		String token = request.getHeader(tokenHeader);
		String refreshedToken = authService.refresh(token);
		return new ObjectRestResponse<>().data(refreshedToken);
	}

	@RequestMapping(value = "verify", method = RequestMethod.GET)
	public ObjectRestResponse<?> verify(String token) throws Exception {
		authService.validate(token);
		return new ObjectRestResponse<>();
	}

	@RequestMapping(value = "entokenString", method = RequestMethod.POST)
	public ObjectRestResponse<?> entokenString(@RequestBody UserInfo userInfo) throws Exception {
		String str = JSON.toJSONString(userInfo);
		
		String tokenString = TokenString.encryptByPublicKey(str.getBytes(), keyConfiguration.getPublicKey());
		return new ObjectRestResponse<>().data(tokenString);
	}

	@RequestMapping(value = "detokenString", method = RequestMethod.POST)
	public ObjectRestResponse<?> detokenString(@RequestParam("tokenString") String tokenString) throws Exception {
		return new ObjectRestResponse<>().data(TokenString.decryptByPrivateKey(tokenString.replace(" ", "+"), keyConfiguration.getPrivateKey()));
	}
	
}
