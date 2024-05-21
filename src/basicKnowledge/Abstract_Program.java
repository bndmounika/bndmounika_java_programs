package basicKnowledge;
//Ass -31 : Program to demonstrate ABSTRACT CLASS
abstract class Amazon_Auth{
	abstract void add();
	
	void mul()
	{
		System.out.println("Multiplication");
	}
}
abstract class Amazon_Login extends Amazon_Auth
{
	abstract void sub();

	void div()
	{
	System.out.println("Division");
	}
	}
public class Abstract_Program extends Amazon_Login{

	public static void main(String[] args) {
		Abstract_Program ab = new Abstract_Program();
		ab.add();
		ab.sub();
		ab.mul();
		ab.div();

	}

	@Override
	void sub() {
		System.out.println("Subtraction");
		
	}

	@Override
	void add() {
		System.out.println("Addition");
	}

}
