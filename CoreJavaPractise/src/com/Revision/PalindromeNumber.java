package com.Revision;
//Palindrome number means if you reverse that number then is same as given number
//eg. 121 reverse is 121, 535 reverse is 535, 1221 reverse is 1221.
public class PalindromeNumber {
public static void main(String[] args) {
	int num=121;
	int temp=num;
	int rev=0,rem;
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
		if(num==rev) {
			System.out.println(num+" is palindrome number");
		}else {
			System.out.println(num+" is not palindrome number");

}
}
}