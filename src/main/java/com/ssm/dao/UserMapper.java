package com.ssm.dao;


import com.ssm.entity.User;

import java.util.List;

public interface UserMapper {
  
    void save(User user);
	boolean update(User user);
    boolean delete(int id);  
    User findById(int id);  
    List<User> findAll();
} 