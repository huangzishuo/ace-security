package com.github.wxiaoqi.security.auth.runner;

import com.github.wxiaoqi.security.auth.common.util.jwt.RsaKeyHelper;
import com.github.wxiaoqi.security.auth.configuration.KeyConfiguration;
import com.github.wxiaoqi.security.auth.util.client.TokenString;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.security.Key;
import java.util.Map;

/**
 * @author ace
 * @create 2017/12/17.
 */
@Configuration
public class AuthServerRunner implements CommandLineRunner {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	private static final String REDIS_USER_PRI_KEY = "AG:AUTH:JWT:PRI";
	private static final String REDIS_USER_PUB_KEY = "AG:AUTH:JWT:PUB";
	private static final String REDIS_SERVICE_PRI_KEY = "AG:AUTH:CLIENT:PRI";
	private static final String REDIS_SERVICE_PUB_KEY = "AG:AUTH:CLIENT:PUB";
	private static final String PRIVATEKEY = "privateKey";
	private static final String PUBLICKEY = "publicKey";

	@Autowired
	private KeyConfiguration keyConfiguration;

	@Override
	public void run(String... args) throws Exception {
		
		if (redisTemplate.hasKey(REDIS_USER_PRI_KEY) && redisTemplate.hasKey(REDIS_USER_PUB_KEY)
				&& redisTemplate.hasKey(REDIS_SERVICE_PRI_KEY) && redisTemplate.hasKey(REDIS_SERVICE_PUB_KEY)
				&& redisTemplate.hasKey(PRIVATEKEY) && redisTemplate.hasKey(PUBLICKEY)) {
			keyConfiguration.setUserPriKey(
					RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_USER_PRI_KEY).toString()));
			keyConfiguration.setUserPubKey(
					RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_USER_PUB_KEY).toString()));
			keyConfiguration.setServicePriKey(
					RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_SERVICE_PRI_KEY).toString()));
			keyConfiguration.setServicePubKey(
					RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(REDIS_SERVICE_PUB_KEY).toString()));

			keyConfiguration.setPublicKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(PUBLICKEY).toString()));
			keyConfiguration
					.setPrivateKey(RsaKeyHelper.toBytes(redisTemplate.opsForValue().get(PRIVATEKEY).toString()));
			
		} else {
			Map<String, byte[]> keyMap = RsaKeyHelper.generateKey(keyConfiguration.getUserSecret());
			Map<String, Key> keys = TokenString.initKey();

			keyConfiguration.setUserPriKey(keyMap.get("pri"));
			keyConfiguration.setUserPubKey(keyMap.get("pub"));
			redisTemplate.opsForValue().set(REDIS_USER_PRI_KEY, RsaKeyHelper.toHexString(keyMap.get("pri")));
			redisTemplate.opsForValue().set(REDIS_USER_PUB_KEY, RsaKeyHelper.toHexString(keyMap.get("pub")));
			keyMap = RsaKeyHelper.generateKey(keyConfiguration.getServiceSecret());
			keyConfiguration.setServicePriKey(keyMap.get("pri"));
			keyConfiguration.setServicePubKey(keyMap.get("pub"));
			redisTemplate.opsForValue().set(REDIS_SERVICE_PRI_KEY, RsaKeyHelper.toHexString(keyMap.get("pri")));
			redisTemplate.opsForValue().set(REDIS_SERVICE_PUB_KEY, RsaKeyHelper.toHexString(keyMap.get("pub")));

			keyConfiguration.setPrivateKey(keys.get(PRIVATEKEY).getEncoded());
			keyConfiguration.setPublicKey(keys.get(PUBLICKEY).getEncoded());
			redisTemplate.opsForValue().set(PRIVATEKEY, RsaKeyHelper.toHexString(keys.get(PRIVATEKEY).getEncoded()));
			redisTemplate.opsForValue().set(PUBLICKEY, RsaKeyHelper.toHexString(keys.get(PUBLICKEY).getEncoded()));
		}
	}
}