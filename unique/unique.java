package com.qa.unique;
import java.util.Arrays;
import java.util.stream.Collectors;

public class unique {
	public static void main(String[] args) {
		System.out.println(uniqueLetters("Hello all of you"));
	}
	public static String uniqueLetters(String sentence) {
		return Arrays.asList(sentence.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining(""));
	}
}
