package com.Revision;

public class StringSpace {
public static void main(String[] args) {
	

		String str = "Hello good morning all";

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == ' ') {
				counter++;
			}
		}
		System.out.println("total space in string are>>" + counter);
	}
}
