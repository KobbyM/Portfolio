package com.qa.palindrome;

public class palindrome {
	public static void main(String[] args) {
		System.out.println(palindrome1("Borrow or Rob"));
	}
	
//	public boolean palindrome(String sentence) {
//		String sen = sentence.replace(" ", "");
//				String reversedString = "";
//		
//		for (int i = sen.length() -1; i>=0;i--) {
//			reversedString = reversedString + sen.charAt(i);
//				
//			
//		}
//	}
	
	public static boolean palindrome1(String sentence) {
		sentence = sentence.toLowerCase().replace(" ", "");
		StringBuilder s = new StringBuilder(sentence);
		return(sentence.equals(StringBuilder.toString()));
	}
}
