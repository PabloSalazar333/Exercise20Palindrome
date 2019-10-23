package com.exercise20palindrome.app;

import com.exercise20palindrome.model.StringApp;;

public class PalindromeApp {

	public static void main(String[] args) {
		// 
		String cadPalindrome1 = "Anita lava la tina.";
		String cadPalindrome2 = "Yo dono rosas oro no doy!!!";
		String cadPalindrome3 = "Isaac no ronca asi";
		
		System.out.println(StringApp.isPalindrome(cadPalindrome1));
		System.out.println(StringApp.isPalindrome(cadPalindrome2));
		System.out.println(StringApp.isPalindrome(cadPalindrome3));
		System.out.println("");
		System.out.println(StringApp.isPalindromeStack(cadPalindrome1));
		System.out.println(StringApp.isPalindromeStack(cadPalindrome2));
		System.out.println(StringApp.isPalindromeStack(cadPalindrome3));
		
	}

}
