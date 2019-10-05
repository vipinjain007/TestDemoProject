package com.javapointers.controller;

public class TestJava {
	
	 public String name() {
		  return "vip";
	 }
	
    public static void main(String arg[]) {
    	System.out.println("Test");
    	
    	MyFirstClass test2=new MyFirstClass();
    	MyFirstClass test3=new MyFirstClass(5,"Jai");
    	MyFirstClass test4=new MyFirstClass(7,"Ajay");
    	test2.getValue();
    	test3.getValue();
    	test4.getValue();
    	//test4.
    	
    }
}
