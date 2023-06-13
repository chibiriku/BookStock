package com.example.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAddRequest implements Serializable{
	
	private String mail;
	private String password;
}
