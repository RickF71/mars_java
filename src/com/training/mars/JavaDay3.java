package com.training.mars;
import java.util.Scanner;

public class JavaDay3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int odds=0, evens=0;
		String name = "John"; // literal
		String fName = "John";
		String firstName = new String("John"); //object
		
		System.out.println(name==fName);
		name = "Mark";
		System.out.println(name);
		System.out.println(fName);
		System.out.println(name==fName);
		
		/*int[] marks = new int[5];
		for (int i=0;i<marks.length;i++) {
			marks[i] = 2*i+4;
		}
		for(int i=0; i< marks.length;i++) {
			System.out.println(marks[i]);
		}*/
		
		for (var i=1; i<=6; i++) {
			System.out.println("Enter Number : ");
			int nbr = scanner.nextInt();
			//input number
			if (nbr%2==0) {
				evens++;
			} else {
				odds++;
			}
			System.out.println("Odds:" + odds + "  Evens:" + evens);
		}
		
		
		
	}

}
