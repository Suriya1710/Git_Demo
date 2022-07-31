package com.java.programs;

public class ReverseString {

	public void rev() {

		String s = "gnirtS esreveR nI ";
		String[] split = s.split(" ");

		String reverseString = "";
		// String originalString ="";

		for (String RS : split) {

			String reverseWord = "";

			for (int i = RS.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + RS.charAt(i);

			}

			reverseString = reverseString + reverseWord + " ";
		}

		for (int i = 0; i < split.length; i++) {

		}

		// System.out.println(reverseString);

	}

	public void rev1() {
		
	}

	public static void main(String[] args) {

	}
}
