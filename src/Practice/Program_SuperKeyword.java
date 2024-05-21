package Practice;
// As-30 Program to demonstrate SUPER KEYWORD
class Parents_SuperKeyword
{
	public void login()
	{
		System.out.println("I am parent class");
	}
}

public class Program_SuperKeyword extends Parents_SuperKeyword
{
	
	public void login()
	{
		super.login();
		System.out.println("I am child class");
	}
	public static void main(String[] args) {
		Program_SuperKeyword PS = new Program_SuperKeyword();
		PS.login();
	}

}
