package com.java.programs;

public class PalindromeNumber {
	
	public static void Palindrome() {
		
		int i = 0, j = 0, a;
		int num = 12321;
		a = num;

		while (a > 0) {
			i = a % 10;
			j = (j*10)+i;
			a = a / 10;
		}

		if (num==j) {
			System.out.println("The Number Is Palindrome Number");
			
		}
		
		else {
			System.out.println("The Number Is Not Palindrome Number");
		}
		
	}
		
	public static void main(String[] args) {
	Palindrome();	
	}
	
	
		
	}


