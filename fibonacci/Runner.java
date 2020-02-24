package com.qa.fibonacci;

public class Runner {
	public static void main(String[] args) {
		System.out.println(fibonacci(40));
		System.out.println(fibonacciAlt(40));
	}
	
	public static int fibonacci(int pos) {
		if (pos >= 0) {
		int array[] = {0,1,0};
		for (int i = 0 ; i <= pos ; i++, array[2] = array[0], array[0] = array[1], array[1] += array[2]) {
			
		}
		return array[2];
		}
		return -1;
	}
	
	public static int fibonacciAlt(int num) {
		if (num ==0) {
			return 0;
		} else if (num ==1) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
