//Assignment 29 Program to demonstrate METHOD OVERRIDING
package Practice;
class Parent_MO{
	public void login()
	{
		System.out.println("I am a Parent class login button");
	}
}
public class Program_methodOverriding extends Parent_MO {

	public void login()
	{
		System.out.println("I am a Child class login button");
	}
	public static void main(String[] args) {
		Program_methodOverriding Pm = new Program_methodOverriding();
		Pm.login();
	}

}
