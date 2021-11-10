package com.rnd.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Stream.*;
public class StreamConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
		Stream<Integer> stream2 = Stream.of(3,4,5,6,7,8);
		Stream<Integer> stream3 = Stream.of(3,4,5,6,7,8);
		Stream<Integer> stream4 = Stream.of(3,4,5,6,7,8);
		
		List<Integer> list = Stream.concat(stream1, stream2).filter(i->i>4).peek(System.out::println).map(u->u).peek(System.out::println).collect(Collectors.toList());
		System.out.println("list :"+list);
		
		
	/*	Stream<Integer> resultingStream  = Stream.concat(Stream.concat(stream1,stream2),  Stream.concat(stream3,stream4));
		Stream<Integer> resultantStream = Stream.concat(stream1, concat(stream2,concat(stream3,stream4))).distinct();
		List<Integer> list1  = resultingStream.collect(Collectors.toList());
		List<Integer> list = resultantStream.collect(Collectors.toList());
		System.out.println("list 1 : "+list1);
		System.out.println("list2  : "+list);
	}
	*/
		//Stream<Integer> finalStream = Stream.of(stream1,stream2,stream3,stream4).flatMap(i->i);
		//System.out.println("finalStream : "+finalStream.collect(Collectors.toList()));
	}
}
