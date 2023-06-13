package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.UserInfoMapper;
import com.example.dto.UserAddRequest;

public class UserInfoService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void save(UserAddRequest userAddRequest) {
		userInfoMapper.insertOne(userAddRequest);
	}
}
