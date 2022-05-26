package javaprogram;

		public class ConstructorExample {

			int a;
		public ConstructorExample(int b)
		{
			//a=20;
			this.a=b;
		}
		public static void main(String[] args) {
			
			ConstructorExample ce=new ConstructorExample(30);
			System.out.println(ce.a);
		}
}
