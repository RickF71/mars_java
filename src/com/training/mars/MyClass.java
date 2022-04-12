package com.training.mars;

public class MyClass {

	public static void main (String args[]) {
		System.out.println("Hello world, first java");
		byte numberByte=12;
		System.out.println("Byte is " + numberByte);
		short shortValue = 48;
		
		int intValue = 89;
		
		byte newByte = (byte)intValue; // explicit typecasting
		
		int newInt = shortValue; // implicit typecasting
		
		int charValue = 'A';
		
		System.out.println("charValue A is " + charValue); // since created type int, shows 65 instead of A
		
		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(150);
		System.out.println(p1.getPersonInfo());
		
		Person p2 = new Person();
		p2.setHeight(100);
		p2.setWeight(50);
		System.out.println(p2.getPersonInfo());
		
	}
	
}
