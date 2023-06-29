package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookInfoMapper;
import com.example.dto.BookRegister;

@Service
public class BookService {
	@Autowired
	private BookInfoMapper bookInfoMapper;
	
	public void bookInsert(BookRegister register) {
		bookInfoMapper.bookInsert(register);
	}
	
	

}
