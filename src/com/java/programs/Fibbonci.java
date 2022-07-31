package com.java.programs;

public class Fibbonci {
	
	public static void main(String[] args) {
	  
		/*int a=0,b=1,c;
		
	System.out.println("THE FIBBONCI NUMBERS");
		
		System.out.print(a+", ");
		System.out.print(b+", ");
		
		c=a+b;
		
		System.out.print(c+", ");
	*/
// by using scanner
		
		/*
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.println("The Value OF Variable A is :");
		int nextInt = s.nextInt();
		a=nextInt;
		System.out.println("The value of Variable B is :");
		int nextInt2 = s.nextInt();
		b=nextInt2;
		c = a+b;
		System.out.println("*********THE FIBBONCI NUMBER*****************");
		System.out.print(a+",");
		System.out.print(b+",");
		System.out.print(c+",");
		*/
		
		
		//more than a fibbonci 
		int a=0,b=1,c ;
		System.out.println("THE FIBBONCI NUMBERS ARE :");
		
		System.out.print(a+", ");
		System.out.print(b+", ");
		
		for (int i = 0; i < 10; i++) {
		c=a+b;
		
		System.out.print(c+", ");
		
			a=b;
			b=c;
	
		}
		
	}
	
	
	}	

