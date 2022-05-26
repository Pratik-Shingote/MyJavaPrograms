package javaprogram;

public class Derived extends Method { 			//single level inheritance

	public void derivedclassmethod()
	{
		System.out.println("Welcome to Inheritance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
		
		d.derivedclassmethod(); 		//Derived class method
		
		d.add(10, 20); 			//Method class methods
		d.sub(555, 55);
		d.mul(20, 20);
		d.div(500, 100);

	}

}
