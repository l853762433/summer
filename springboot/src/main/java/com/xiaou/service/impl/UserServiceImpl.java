package com.xiaou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaou.mapper.UserMapper;
import com.xiaou.pojo.User;
import com.xiaou.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User UserLogin(User user) {
		return userMapper.selectUserByUsernameAndPassword(user);
	}

}
