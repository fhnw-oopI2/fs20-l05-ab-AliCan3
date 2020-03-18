package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class Fibanocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> s;
		Stream.iterate(new Tuple<Integer>(0,1),k -> new Tuple <Integer> ( k.t2 , k.t1 + k.t2 ))
		.limit(15)
		.forEach(k->System.out.println(k.t2))
		;
	}

}
