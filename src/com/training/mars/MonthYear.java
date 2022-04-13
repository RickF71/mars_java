package com.training.mars;

import java.util.Scanner;

public class MonthYear {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// These entry items should have checks for valid replies 
		System.out.println("Enter Month Number");
		int month = scanner.nextInt();
		System.out.println("Enter Year Number");
		int year = scanner.nextInt();
		
		// This entire switch, as it stands, could utilize an array of months
		//   to make it much simpler code
		switch (month) {
		case 1:
			System.out.println("January " + year + " has 31 days."); 
			break;
		case 2:
			if ((year % 4)==0) {
				System.out.println("February " + year + " has 29 days.");
			} else {
				System.out.println("February " + year + " has 28 days."); 
			}
			break;
		case 3:
			System.out.println("March " + year + " has 31 days."); 
			break;
		case 4:
			System.out.println("April " + year + " has 30 days."); 
			break;
		case 5:
			System.out.println("May " + year + " has 31 days."); 
			break;
		case 6:
			System.out.println("June " + year + " has 30 days."); 
			break;
		case 7:
			System.out.println("July " + year + " has 31 days."); 
			break;
		case 8:
			System.out.println("August " + year + " has 31 days.");
			break; 
		case 9:
			System.out.println("September " + year + " has 30 days."); 
			break;
		case 10:
			System.out.println("October " + year + " has 31 days."); 
			break;
		case 11:
			System.out.println("November " + year + " has 30 days."); 
			break;
		case 12:
			System.out.println("December " + year + " has 31 days."); 
			break;

		}
		scanner.close();
		System.out.println();
	}
}
