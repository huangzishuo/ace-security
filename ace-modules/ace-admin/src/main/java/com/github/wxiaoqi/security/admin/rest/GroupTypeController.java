package com.github.wxiaoqi.security.admin.rest;

import com.github.pagehelper.Page;
import com.github.wxiaoqi.security.admin.biz.GroupTypeBiz;
import com.github.wxiaoqi.security.admin.entity.Group;
import com.github.wxiaoqi.security.admin.entity.GroupType;
import com.github.wxiaoqi.security.admin.mapper.GroupTypeMapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.github.wxiaoqi.security.common.msg.TableResultResponse;
import com.github.wxiaoqi.security.common.rest.BaseController;

import tk.mybatis.mapper.entity.Example;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-08 11:51
 */
@Controller
@RequestMapping("groupType")
public class GroupTypeController extends BaseController<GroupTypeBiz, GroupType> {
	
	@Autowired
	private GroupTypeMapper groupTypeMapper;
	//
	// @RequestMapping(value = "/page",method = RequestMethod.GET)
	// @ResponseBody
	// public TableResultResponse<Object> page(@RequestParam(defaultValue = "10")
	// int limit, @RequestParam(defaultValue = "1")int page, String name){
	// Example example = new Example(GroupType.class);
	// if(StringUtils.isNotBlank(name))
	// example.createCriteria().andLike("name", "%" + name + "%");
	// Page<Object> result = PageHelper.startPage(page, limit);
	// baseBiz.selectByExample(example);
	// return new TableResultResponse<Object>(result.getTotal(),result.getResult());
	// }
	@Override
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public ObjectRestResponse<GroupType> add(@RequestBody GroupType entity) {
		entity.setId(groupTypeMapper.getMaxId() + 1);
		baseBiz.insertSelective(entity);
		return new ObjectRestResponse<GroupType>();
	}
}
