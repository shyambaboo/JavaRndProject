package com.rnd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("B","A","D","A","B");
		List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctList : "+distinctList);
		
	}

}
