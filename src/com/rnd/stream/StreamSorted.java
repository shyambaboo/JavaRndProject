package com.rnd.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,5,3,8,2,6);
		
		Comparator<Integer> sortedComparator = new Comparator<Integer>() {
			
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		//List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//List<Integer> sortedList = list.stream().sorted(sortedComparator).collect(Collectors.toList());
		List<Integer> sortedList = list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("sortedList : "+sortedList);
	}

}
