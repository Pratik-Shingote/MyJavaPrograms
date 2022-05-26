package javaprogram;

	interface Poly
	{
		void getArea(int length, int breadth);
	}
	
	class Rectangle implements Poly
	{
		public void getArea(int length, int breadth)
		{
			System.out.println("The area of the rectangle is: "+(length*breadth));
		}
	}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle();
		r.getArea(5, 5);
	}

}
