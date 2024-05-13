package Inheritance_java;
class Grand_Parent
{
	static void add()
	{
	System.out.println("addition");	
	}
}
class Parent2 extends Grand_Parent
{
	static void sub()
{
		System.out.println("Subtraction");	
}

}
public class MultilevelInheritance extends Parent2{
	static void mul()
	{
		System.out.println("Multiplication");	
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
	}

}
