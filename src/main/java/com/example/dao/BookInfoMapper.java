package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.BookRegister;
import com.example.entity.MBook;

@Mapper
public interface BookInfoMapper {
	
	void bookInsert(BookRegister Register);
	
	List<MBook> bookFindAll();

}
