package javaprogram;

import java.util.Arrays;

public class ArrayExercise2 {

	public static void main(String[] args) {
		 
		String a[]={"Google","Microsoft","TestLeaf","Maverick"};
		
		System.out.println("Length of the array is: "+a.length);
		
		Arrays.sort(a);   
		System.out.println("Elements of array sorted in ascending order: ");  
                 
              for (int i=0; i<a.length; i++)   
                {       
            	  	System.out.println(a[i]);   
                }
              
        System.out.println("Elements of array printed in reverse order: ");
              for(int i=a.length-1;i>=0;i--)
               {
            	  	System.out.print(a[i] + "  ");  
            	  	 
               }  

	}

}
