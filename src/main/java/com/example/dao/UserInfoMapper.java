package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.UserAddRequest;

@Mapper
public interface UserInfoMapper {
	
	void insertOne(UserAddRequest userRequest);

}
