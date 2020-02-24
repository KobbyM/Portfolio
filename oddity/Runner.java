package com.qa.oddity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public List<Integer> oddity (int[] nums){
		return Arrays.stream(nums).filter(num->num%2==1).collect(Collectors.toList());
	}
	
}
