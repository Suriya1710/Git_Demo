package com.java.programs;

public class ArmstrongNumber {

	public static void Armstrong() {

		int i = 0, j = 0, a;
		int num = 153;
		a = num;

		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}

		if (num==j) {
			System.out.println("The Number Is Armstrong Number");
			
		}
		
		else {
			System.out.println("The Number Is Not Armstrong Number");
		}
		
	}

	public static void main(String[] args) {
Armstrong();
	}
}
