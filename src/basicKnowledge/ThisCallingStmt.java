package basicKnowledge;
class Mouni{
	Mouni()
	{
		this(45);
		System.out.println("1");
	}
	Mouni(int a)
	{
		this("mouni");
		System.out.println("2");
	}
	Mouni(String s)
	{
		System.out.println("3");
	}
	
}

public class ThisCallingStmt {

	public static void main(String[] args) {
		Mouni m = new Mouni();

	}

}
