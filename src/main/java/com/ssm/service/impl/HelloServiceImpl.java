package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SQ_BXZ on 2018-06-08.
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	UserMapper userMapper;
	@Override
	public String helloSave() {
		userMapper.save(new User().setId(1).setUserName("张三").setAge("243岁"));
		return "插入成功";
	}

	@Override
	public User helloSelect() {
		return userMapper.findById(1);
	}
}
