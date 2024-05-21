package Assignment;
abstract class Amazon
{
	abstract void login();
	
	void username()
	{
		System.out.println("I am username");
	}
}
public class Abstract_practice extends Amazon {

	public static void main(String[] args) {
		Abstract_practice ab = new Abstract_practice();
		ab.login();
		ab.username();

	}

	@Override
	void login() {
System.out.println("I am a Login under child");		
	}

}
