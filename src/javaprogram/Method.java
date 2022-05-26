package javaprogram;

public class Method {

	public int add(int x,int y)
	{
		System.out.println("The addition of no :"+(x+y));
		return x;
	}
	public double sub(double a,double b)
	{
		System.out.println("Thw subtraction of no: "+(a-b));
		return a;
	}
	public double mul(double c,double d)
	{
		System.out.println("The multiplication of no :"+(c*d));
		return c;
	}
	public int div(int e,int f)
	{
		System.out.println("The division of no :"+(e/f));
		return e;
	}
	//for method overloading we define same method name with different parameters like integer,double 
	public double add(double p,double q) //here we use method overloading
	{
		System.out.println("The addition of no :"+(p+q));
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method m=new Method();
		m.add(10, 20);
		m.sub(500.55, 100.555);
		m.mul(50.5, 5.5);
		m.div(500, 100);
		m.add(40.40, 50.5000);    //here we pass arguments
		
		//System.out.println(m.add(10, 20));
	//	System.out.println(m.sub(500.55, 100.555));
	}

}
