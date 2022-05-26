package javaprogram;

public class Encapsulation {
	
	private String name;
	private int id;
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String newName)
	{
		this.name=newName;
	}
	
	public void setID(int newID)
	{
		this.id=newID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation e=new Encapsulation();
		e.name="Pratik Shingote";
		e.id=50;
		System.out.println(e.name);
		System.out.println(e.id);
	}

}
