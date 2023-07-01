package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookInfoMapper;
import com.example.dto.BookRegister;
import com.example.entity.MBook;

@Service
public class BookService {
	@Autowired
	private BookInfoMapper bookInfoMapper;
	
	public void bookInsert(BookRegister register) {
		bookInfoMapper.bookInsert(register);
	}
	
	public List<MBook> bookFindAll(){
		return bookInfoMapper.bookFindAll();
	}
	
	

}
