package Inheritance_java;
class Parent{
	
	 void add()
	{
		System.out.println("Addition");
	}
}

public class Inheritance1 extends Parent{

	static void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) {
		Inheritance1 p = new Inheritance1();
		p.add();
		sub();
		
		
 
	}

}
