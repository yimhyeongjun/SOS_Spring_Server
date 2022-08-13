package com.example.demo.model;

public class UserInfo {
	
	private String id;
	private int age;
	private int income_grade;
	private int total_fare;
	
	public UserInfo(String id, int age, int income_grade, int total_fare) {
		super();
		this.id = id;
		this.age = age;
		this.income_grade = income_grade;
		this.total_fare = total_fare;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome_grade() {
		return income_grade;
	}
	public void setIncome_grade(int income_grade) {
		this.income_grade = income_grade;
	}
	public int getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(int total_fare) {
		this.total_fare = total_fare;
	}
	
}
