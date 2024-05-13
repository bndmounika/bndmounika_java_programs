package Inheritance_java;
/*how to access non static in parent class*/

class Parent3
{
	void add()
	{
		System.out.println("addition");
	}
	
	void sub()
	{
		System.out.println("subtraction");
	}
	
}
public class Program3_Inheritnce extends Parent3{
	
	void mul()
	{
		System.out.println("multiplication");
	}
	public static void main(String[] args) {
		
		Program3_Inheritnce P = new Program3_Inheritnce();
		P.add();
		P.sub();
		P.mul();
  
	}

}
