package com.java.programs;

public class PrimeNumbers {	

	/*public static void pN() {
	
		for (int i = 2; i <=9; i++) {
			int a = 0;
			
			for (int j = 2; j <i; j++) {
				if (i/j==0) {
					System.out.println("not pn");
				}
			}
			if (a==0) {
			System.out.printf("\n The Prime Numbers Is :" +i," ");	
			}
			
		}
		
		
		
	} */
	static int a;
	public static void pn2() { 
		int i=17,j=2;

		if (i%j==0) {
			a=0;
		}
		else {
			a=1;
		}
		
		
	}
	
	public static void main(String[] args) {
		//pN();
	
	if (a==0) {
		System.out.println("prime");
	}	
	else  {
		System.out.println("not prime");
	}
	pn2();
	}
}



