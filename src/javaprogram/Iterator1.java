package javaprogram;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> in=new ArrayList<String>();
		in.add("10");
		in.add("20");
		in.add("10");
		in.add("30");
		
		//ITERATOR
		
		Iterator<String> it=in.iterator();
		
		System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}

}
