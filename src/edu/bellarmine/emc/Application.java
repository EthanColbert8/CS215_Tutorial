package edu.bellarmine.emc;

import java.util.Scanner;

/**
 * @author ecolbert
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter another number: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of those numbers is " + sum);
		
		input.close();
		
	}

}
