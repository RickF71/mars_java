package com.training.mars;
import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args) {
        SortNumbers ob = new SortNumbers();
        Scanner scanner = new Scanner(System.in);
        // int nbr[] = { 64, 24, 25, 10, 22, 11 };
        int[] nbr = new int[5];
        
        for (var i=0; i <= 4; i++) {
        	System.out.println("Enter number:");
        	nbr[i] = scanner.nextInt();
        };

        System.out.println("Original array");
        ob.printArray(nbr);
        ob.sortNums(nbr);
        System.out.println("Sorted array");
        ob.printArray(nbr);
	}
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	void sortNums(int arr[])
	{
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++)
	        for (int j = 0; j < n - i - 1; j++)
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	}
}
