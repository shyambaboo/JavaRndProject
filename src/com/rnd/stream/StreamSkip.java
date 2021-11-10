package com.rnd.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> evenNumInfiniteStream = Stream.iterate(2, n->n+2).peek(System.out::println);
		List<Integer> list = evenNumInfiniteStream.skip(5).peek(System.out::println).
		limit(10).collect(Collectors.toList());
		System.out.println("List : "+list);
	}

}
