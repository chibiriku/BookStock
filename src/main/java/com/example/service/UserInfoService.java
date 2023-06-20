package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserInfoMapper;
import com.example.dto.SignupForm;

@Service
public class UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public void insertOne(SignupForm form) {
		userInfoMapper.insertOne(form);
	}
}