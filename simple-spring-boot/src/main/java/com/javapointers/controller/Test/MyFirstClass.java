package com.javapointers.controller.Test;


public class MyFirstClass {
    private int id;
	private int age;
	private String name;
	private String city="Aa";
    public static String details="V";
	public MyFirstClass() {
	      
	}

	{
		System.out.println(details);
		
		System.out.println("Static");
		
	}
	
	public MyFirstClass(int  id,String name,String city,int age) {
	      this.id = id;
	      this.name = name;
	      this.city=city;
	      this.age=age;
	}
	
	public void display() {
		System.out.println("Age:"+age);
		System.out.println("Name:" + name);
		System.out.println("City:" + city);

	}
	
	
	public MyFirstClass(int  id) {
	      this.id = id;
	}
	
	public void setage(int age) {
		this.age =age;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public void showAllInfo() {
		System.out.println("Age:"+age);
		System.out.println("Name:" + name);
		System.out.println("City:" + city);
	}
}

