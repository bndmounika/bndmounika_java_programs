package basicKnowledge;
class College1{
	College1()
	{
		System.out.println("College with no parameters");
	}
	College1(int a)
	{
		this();
		System.out.println("College with int parameters");
	}
	College1(String s)
	{
		this(1);
		System.out.println("College with String parameters");
	}
}

public class ThisCallingStmt2 {

	public static void main(String[] args) {
	//	College1 c= new College1("Mounika");
		new College1("mouni");

	}

}
