package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.BookRegister;

@Mapper
public interface BookInfoMapper {
	
	void bookInsert(BookRegister Register);

}
