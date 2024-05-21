package basicKnowledge;
class MethodOveriding_Parent{
	void login(){
		System.out.println("Login with mobile no.");
	}
}

public class MethodOverridingEx extends MethodOveriding_Parent
{
	void login()
	{
		
		System.out.println("Login with email id");
	}
	public static void main(String[] args)
	{
		MethodOverridingEx m = new  MethodOverridingEx();
		m.login();
}
}
	

		