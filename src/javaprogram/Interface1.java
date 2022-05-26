package javaprogram;

	interface Cal
	{
		void add(int a,int b); //for empty method we use void
		void sub(int x,int y);
	}
	  class Maths implements Cal{
	
		public void add(int a,int b)   //here we defines(implements)
		{
			System.out.println("The addition of no is: "+(a+b));
		}
		public void sub(int x,int y)
		{
			System.out.println("The subtraction of no is: "+(x-y));
		}
		
	  }

	 public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=new Maths();
		m.add(2,3);              //passing the arguments
		m.sub(5,3);
	}

}

	
