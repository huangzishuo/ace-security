package com.github.wxiaoqi.security.auth.controller;

import com.github.wxiaoqi.security.auth.biz.ClientBiz;
import com.github.wxiaoqi.security.auth.entity.Client;
import com.github.wxiaoqi.security.auth.entity.ClientService;
import com.github.wxiaoqi.security.auth.mapper.ClientMapper;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.github.wxiaoqi.security.common.rest.BaseController;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

/**
 * @author ace
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz, Client> {

	@Resource
	ClientMapper clientMapper;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public ObjectRestResponse<Client> add(@RequestBody Client client) {
		client.setId(clientMapper.getMaxId() + 1);
		baseBiz.insertSelective(client);
		return new ObjectRestResponse<Client>();
	}

	@RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
	@ResponseBody
	public ObjectRestResponse modifyUsers(@PathVariable int id, String clients) {
		baseBiz.modifyClientServices(id, clients);
		return new ObjectRestResponse().rel(true);
	}

	@RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
	@ResponseBody
	public ObjectRestResponse<ClientService> getUsers(@PathVariable int id) {
		return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
	}
}
