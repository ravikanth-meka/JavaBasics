package com.scenarios;

public class Person {

	private String name;
	private Integer age;
	private String address;
	private String city;
	
	
	
	
	public Person(String name, Integer age, String address, String city) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
