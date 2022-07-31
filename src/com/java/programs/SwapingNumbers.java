package com.java.programs;

public class SwapingNumbers {

	/*
	 * public static void swaping() { int a = 17; int b = 13; int c;
	 * 
	 * c = a; a = b; b = c;
	 * 
	 * 
	 * System.out.println(a); System.out.println(b);
	 * 
	 * }
	 */
/*
	public static void swaping2(int a1, int b1) {
		System.out.println("BEFORE SWAPING");
		System.out.println("a1 is : " + a1);
		System.out.println("b1 is : " + b1);

		System.out.println("AFTER SWAPING");
         a1=a1+b1;
         b1=a1-b1;
         a1=a1-b1;
         
		System.out.println("After SWAP is : " +a1);
		System.out.println("AFTER SWAP is : "+b1);
		
		}
*/
	
	/*
	 * public static void swapingWords() {
	 * 
	 * 
	 * String S = "Suriya"; String V = "Veeran"; String A;
	 * 
	 * A=S; S=V; V=A;
	 * 
	 * System.out.println(S); System.out.println(V);
	 */

	public static void main(String[] args) {
		// swaping();
	//	swaping2(10, 2);
		// swapingWords();
		// swapingwords2("Suriya","Veeran");
	
	int a=4,b=5;
	
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("After Swaping");
	System.out.println(a);
	System.out.println(b);
	
	
	
	
	
	}

}