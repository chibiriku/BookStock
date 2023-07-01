package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.MBook;
import com.example.service.BookService;

@RequestMapping("/book")
@Controller
public class BookListController {
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/list")
	public String bookList(Model model) {
		List<MBook> bookList = bookService.bookFindAll();
		model.addAttribute("booklist", bookList);
		return "book/BookList";
		
	}

}
