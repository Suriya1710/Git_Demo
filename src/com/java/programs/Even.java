package com.java.programs;

public class Even {
	
	public static void checkEven() {
		
		for (int a = 0; a <10; a++) {
		
			if (a%2==0) {
				System.out.print("The no is EVEN : "+a +", ");
			}
			
		
		else if (a%2!=0) {
			System.out.print("The No is odd: "+a);
	}			
		}
	}
	public static void main(String[] args) {
	checkEven();
	}

}
