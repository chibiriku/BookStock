package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SignupForm implements Serializable{
	
	private String userName;
	private String mail;
	private String password;
}
