package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/book")
@Controller
public class BookListController {
	
	
	@GetMapping("/list")
	public String bookList(Model model) {
		
		return;
		
	}

}
