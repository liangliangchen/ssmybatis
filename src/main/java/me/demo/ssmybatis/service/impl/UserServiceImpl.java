package me.demo.ssmybatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.demo.ssmybatis.dao.UserDao;
import me.demo.ssmybatis.model.User;
import me.demo.ssmybatis.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
