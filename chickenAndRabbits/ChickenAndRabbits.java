package com.qa.chickenAndRabbits;

public class ChickenAndRabbits {
	public static void main(String[] args) {
		
	}
	
	public void chickenAndRabbit(int heads, int legs) {
		boolean solution;
		for (int i = 0; i < heads; i++) {
			int r = heads -i;
			int c = i;
			
			if ((r*4 + c*2) == legs) {
				System.out.println("rabbit: " + r);
				System.out.println("chicken: " + c);
				solution = true;
			}
		
		if (solution) {
			System.out.println("no solution available");
		}
		}
	}
}
