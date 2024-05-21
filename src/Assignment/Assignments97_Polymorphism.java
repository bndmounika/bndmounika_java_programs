package Assignment;
//Assignment 97- Use the Concept of Polymorphism and write the program of MethodOverriding and create 
//the object of ParentCalss execute the Program..
class Human{
	void Man()
	{
		System.out.println("I am a man");
	}
	void Women()
	{
		System.out.println("I am a Women");
	}
	void Kid()
	{
		System.out.println("I am a Kid");
	}
}
public class Assignments97_Polymorphism extends Human
{
	void Kid()
	{
		System.out.println("I am a child Kid");
	}
	public static void main(String[] args) {
		Human m = new Human();
		m.Kid();
		m.Women();
		m.Man();
		
		
	}
	}

	

