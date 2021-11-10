package com.rnd.pojo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaxService {

	public static List<Employee> evaluateTaxUsers(String input) {
		return (input.equalsIgnoreCase("tax"))
				? DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
				: DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);
        
		int[] intArray = infiniteNumberStream.limit(10)
		            .toArray();
		 
		System.out.println(Arrays.toString(intArray));  
		//System.out.println(evaluateTaxUsers("tax"));
	}
}
