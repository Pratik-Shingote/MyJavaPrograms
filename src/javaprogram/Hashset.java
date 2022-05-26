package javaprogram;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Unit Testing");
		hs.add("System Testing");
		hs.add("Inetgration Testing");
		hs.add("Acceptance Testing");
		hs.add("Unit Testing");
		
		System.out.println(hs);
		
		HashSet<Integer> in=new HashSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(20);
		in.add(30);
		
		for(Integer i:in)
		{
			System.out.println(i);
		}
	}
}
