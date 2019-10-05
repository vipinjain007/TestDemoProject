package com.javapointers.controller;

public class MyFirstClass {
	int records=9;
	String name="vipin";
	boolean test=true;
	char s='w';
	
	MyFirstClass(int v){
		this.records=v;
		System.out.println("v"+v);
	}
	MyFirstClass(int v,String r){
		this.records=v;
		this.name=r;
	}
	MyFirstClass(){
		
	}
	
	public void getValue() {
		System.out.println("name:"+name);
		System.out.println("records"+records);	
	}
	
	private void name() {
		System.out.println("Private");
	}

}
