package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.model.UserInfo;

@RestController
public class UserInfoController {

	
	private UserInfoMapper mapper;
	
	public UserInfoController(UserInfoMapper mapper) {
		this.mapper = mapper;
	}
	
	@GetMapping("/user/{id}")
	public UserInfo getUserInfo(@PathVariable("id") String id) {
		return mapper.getUserInfo(id);
	}
	
	@GetMapping("/user/all")
	public List<UserInfo> getUserInfoList(){
		return mapper.getUserInfoList();
	}
	
	@PutMapping("/user/{id}")
	public void putUserInfo(@PathVariable("id") String id, @RequestParam("age") int age, @RequestParam("income_grade") int income_grade, @RequestParam("total_fare") int total_fare) {
		mapper.insertUserInfo(id, age, income_grade, total_fare);
	}
	
	@PostMapping("/user/{id}")
	public void postUserInfo(@PathVariable("id") String id, @RequestParam("age") int age, @RequestParam("income_grade") int income_grade, @RequestParam("total_fare") int total_fare) {
		mapper.updateUserInfo(id, age, income_grade, total_fare);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserInfo(@PathVariable("id") String id) {
		mapper.deleteUserInfo(id);
	}
}
