package basicKnowledge;
class Over_parent{
	 void login()
	 {
	System.out.println("Login with Phone number");
	 	}
}
public class Overriding_problem extends Over_parent {
	 void login()
	  {
		 super.login();
		 System.out.println("Login with emailId");
	  }
	
	public static void main(String[] args) {
		Overriding_problem ov = new Overriding_problem();
	
		ov.login();
	}

}
