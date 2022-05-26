package javaprogram;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]={10,20,30,40,50};
		
		for(int e:i)	
		{
			System.out.println(e);
		}
		
		try
		{
			System.out.println("You printed correct value: "+i[1]);
		}
		catch(Exception e)
		{
			System.out.println("Error is Occurred");
		}
		finally
		{
			System.out.println("Exception Handled");
		}
	}

}

