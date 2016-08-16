package com.reviewdayone;

import java.util.Scanner;

public class WorkingWithLoops {

	public static void main(String[] args) {

		// for loops
		// do...while loops
		// while loops
		Scanner sc = new Scanner(System.in);

		boolean aNewBoolean = false;

		do {
			aNewBoolean = false;

			System.out.println("Do you want to continue?");
			String userInput = sc.nextLine();

			while (!(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("no"))) {
				System.out.println("I don't understand");
				aNewBoolean = true;
				break;
			}
		} while (aNewBoolean);

		//
		// int i = 0;
		// boolean someBoolean = true;
		//
		// do {
		// System.out.println("Hi class");
		// i++;
		//
		// System.out.println("Do you want to say 'Hi Class' again?");
		// System.out.println("Press 'n' to quit");
		// String userInput = sc.nextLine();
		//
		// if (userInput.equalsIgnoreCase("N")) {
		// someBoolean = false;
		// System.out.println("You said hi to the class " + i + " times.");
		// }
		//
		// } while (someBoolean);

		// for (int i = 0; i < 10; i++) {
		// System.out.println("Our i loop is = to " + i);
		// System.out.println();
		//
		// for (int j = 0; j < 10; j++) {
		// System.out.println("Our j loop is = to " + j);
		//
		// }
		// System.out.println();
		// }
		//
		// for (int i = 0; i < 100; i++) {
		// }

	}// main

} // class
