package com.waitfor.bootstudy.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waitfor.bootstudy.pojo.JSONResult;
import com.waitfor.bootstudy.pojo.Resource;

@RestController
public class HelloController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/resource")
	public JSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource,bean);
		return JSONResult.ok(bean);
	}

}
