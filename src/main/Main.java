package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
	
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("enter array length");
		length = input.nextInt();
		
		int[] numbers = new int[length];
		
		for(int counter = 0; counter < length; counter++) {
			System.out.println("enter array value " + (counter + 1));
			numbers[counter] = input.nextInt();
		} 
		
		input.close();
		System.out.println("Your original number array is: ");
		for(int counter = 0; counter < length; counter ++) {
			System.out.println(numbers[counter]);
		}

		for(int j = 0; j < length; j++ ) {
			for(int i = 1; i < length; i++) {
				if(numbers[i-1] > numbers[i]) {
					int temp = numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		System.out.println("Your bubble sorted array is: ");
		for(int i = 0; i < length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
