package com.ssm.service;

import com.ssm.entity.UserInfo;

import java.util.List;

/**
 * Created by SQ_BXZ on 2018-06-11.
 */
public interface LoginService {
	/**
	 *
	 * @Title: selectPwdByName
	 * @Description: 根据用户账号查询密码
	 * @param username
	 * @return String 返回类型
	 * @throws
	 */
	String selectPwdByName(String username);
	/**
	 *
	 * @Title: selectRolesByName
	 * @Description: 根据用户账号查询角色集合
	 * @param userName
	 * @return List<String> 返回类型
	 * @throws
	 */
	List<String> selectRolesByName(String userName);
	/**
	 *
	 * @Title: selectPermissionsByName
	 * @Description: 根据用户账号查询用戶權限集合标识
	 * @param @param userName
	 * @return List<String> 返回类型
	 * @throws
	 */
	List<String> selectHasPermissionsByName(String userName);
	/**
	 *
	 * @Title: selectUserInfoByName
	 * @Description: 根据用户名查询用户信息
	 * @param @param username
	 * @return UserInfo 返回类型
	 * @throws
	 */
	UserInfo selectUserInfoByName(String username);

}
