package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.BookRegister;
import com.example.service.BookService;

@RequestMapping("/book")
@Controller
public class BookRegisterController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/register")
	public String getBookRegister(Model model) {
		model.addAttribute("bookregister", new BookRegister());
		return "book/BookRegister";
	}
	
	@PostMapping("/register")
	public String postBookRegister(@ModelAttribute BookRegister register, Model model) {
		bookService.bookInsert(register);
		return "redirect:/bookList";
	}

}
