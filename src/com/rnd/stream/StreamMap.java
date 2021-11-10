package com.rnd.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Shyam","Baboo","Gupta").stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> country = Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"), Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).flatMap(List::stream).collect(Collectors.toList()); 
		System.out.println("list :"+list);
		System.out.println("country :"+country);

	}

}
