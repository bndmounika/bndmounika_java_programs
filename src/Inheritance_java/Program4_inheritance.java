package Inheritance_java;
class GrandParent
{
	void add()
	{
		System.out.println("Addition");
	}
}
class Parent_Multilevel extends GrandParent
{
	static void sub()
	{
		System.out.println("Subtraction");
	}
}

public class Program4_inheritance extends Parent_Multilevel{
 static void mul()
 {
	 System.out.println("multiplication");
 }
	public static void main(String[] args) {
		Program4_inheritance p = new Program4_inheritance();
			p.add();
			sub();
			mul();
	}

}
