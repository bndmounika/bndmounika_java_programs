package basicKnowledge;
interface interface1{
	void login();
	void logout();
	
}
interface interface2{
	void gmail();
	void youtube();
}
public class MultipleLevel_inheritance implements interface1,interface2 {

	public static void main(String[] args) {
		 MultipleLevel_inheritance m = new  MultipleLevel_inheritance();
		 m.gmail();
		 m.youtube();
		 m.login();
		 m.logout();

	}

	public void gmail() {
		System.out.println("Gmail");
		
	}

	public void youtube() {
		System.out.println("youtube");
		
	}

	public void login() {
		System.out.println("Login");
		
	}

	public void logout() {
		System.out.println("Logout");
		
	}

}
