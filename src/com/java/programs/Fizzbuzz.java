package com.java.programs;

public class Fizzbuzz {

	// Fizz * Odd/Even = Fizz
	// Buzz * Odd/Even = Buzz
	// Fizz * Buzz = FizzBuz

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZ BUZZ");
			}

			else if (i % 3 == 0) {
				System.out.println("FIZZ");
			}

			else if (i % 5 == 0) {
				System.out.println("BUZZ");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
