package com.ssm.service.impl;

import com.ssm.dao.TestMapper;
import com.ssm.entity.UserInfo;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SQ_BXZ on 2018-06-11.
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	TestMapper testMapper;
	@Override
	public String selectPwdByName(String userName) {
		return testMapper.selectPwdByName(userName);
	}
	@Override
	public List selectRolesByName(String userName) {
		return testMapper.selectRolesByName(userName);
	}
	@Override
	public List selectHasPermissionsByName(String userName) {
		return testMapper.selectHasPermissionsByName(userName);
	}
	@Override
	public UserInfo selectUserInfoByName(String username) {
		return testMapper.selectUserInfoByName(username);
	}
}
