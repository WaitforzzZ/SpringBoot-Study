package com.waitfor.bootstudy.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waitfor.bootstudy.pojo.JSONResult;
import com.waitfor.bootstudy.pojo.User;

@RestController
public class UserController {

	@RequestMapping("/user")
	public JSONResult getUser() {
		User u = new User();
		u.setName("waitfor");
		u.setPassword("123456");
		u.setAge(18);
		u.setBirthday(new Date());
		return JSONResult.ok(u);
	}

}
