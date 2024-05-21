package basicKnowledge;

class Parent{
	void Mani(){
		System.out.println("I am a Parent Mani");
	}
	void Mouni()
	{
		System.out.println("I am a Parent Mouni");
	}
	
}
abstract class Child extends Parent {
	abstract void child();
	abstract void grandchild();
	void Siri()
	{
		System.out.println("I am a child Siri");
	}
	void Narayana()
	{
		System.out.println("I am a child Narayana");
	}
}

public class Assignment_Abstract extends Child{
	void srinu()
	{
	System.out.println("I am a srinu in main class");
	}
	void radha()
	{
		System.out.println("I am a Radha in main class");
	}
	public static void main(String[] args) {
		 Assignment_Abstract ab  = new  Assignment_Abstract();
		 ab.child();
		 ab.grandchild();
		 ab.Mani();
		 ab.Mouni();
		 ab.srinu();
		 ab.radha();
		 ab.Siri();
		 ab.Narayana();
	}
	@Override
	void child() {
		System.out.println("I am a child in abstract method");
		
	}
	@Override
	void grandchild() {
		System.out.println("I am a Grandchild in abstract method");
		
	}

}
