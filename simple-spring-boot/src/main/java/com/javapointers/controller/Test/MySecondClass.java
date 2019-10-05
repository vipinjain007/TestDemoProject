package com.javapointers.controller.Test;


public class MySecondClass {

	public static void main (String[]args) {
		System.out.println("student info");
		
		MyFirstClass test2=new MyFirstClass(23,"vipin","pune",35);
		
		 test2.display();
		 System.out.println(test2.details);
		MyFirstClass test3=new MyFirstClass(25,"vipin23","pune23",35);
		test3.display();;
		System.out.println(test3.details);
		
		//test3.display();
		
		
}
	
}
