package com.java.programs;

public class AscendingOrder {

	public static void ascorder() {

		int asc;
		int a[] = { 1, 5, 4, 10, 6, 7 };
		
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					asc = a[i]; // c=a
					a[i] = a[j]; // a=b
					a[j] = asc; // b=c
				}

			}
		}
		
	

		System.out.println("*******ASCENDING ORDER**********");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
		
		public static void main(String[] args) {
			ascorder();
		
		}
}
		
