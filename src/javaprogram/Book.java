package javaprogram;

 public class Book{
	private static int counter;
	private String name;
	private String author;
	
	public String getName()
	{
		return name;
	}
	public String getAuthor()
	{
		return author;
	}
	
	 Book(String name,String author)
	{
		this.name=name;
		this.author=author;
		counter++;
	}

	public static int getInstanceCount() {
			
		return counter;
		
		
	}
	public static void main(String[] args)
	{
				
		new Book("a1","a2");
		new Book("b1","b2");
		new Book("c1","c2");
		new Book("d1","d2");
		
		System.out.println("Total no of objects: "+Book.getInstanceCount());
	}

}
