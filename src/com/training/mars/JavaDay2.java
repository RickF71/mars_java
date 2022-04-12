package com.training.mars;

import java.util.Scanner;

public class JavaDay2 {
	public static void main (String args[]) {

		
		 pattern(); 
		/*luckynum();*/
		

	}
	private static void luckynum() {
		Scanner scanner = new Scanner(System.in);
		
		int numguess = 4; 
		int luckyNumber = 14;
		System.out.println("Java day 2");
		
		System.out.println("You have " + numguess + " guesses at the number between 1 and 20");
		System.out.println("Enter lucky number : ");
		
		
		
		for (int i=numguess;i>0;i--) {
			int lucky = scanner.nextInt();
			if (lucky==luckyNumber) {
				System.out.println("You got the lucky number!");
				break;
			} else if (lucky > luckyNumber) {
				System.out.println("That's too high! " + (i-1) + " guesses left");
			} else {
				System.out.println("That's too low! " + (i-1) + " guesses left");
			}
		}
		scanner.close();
	}
	private static void pattern() {
		int k=0;
		for (int i = 1; i<=3; i++) {
			for (int j=1; j <= i; j++) {
				k++;
				System.out.print(k);
			}
			System.out.println();
		}
	
	}

}
