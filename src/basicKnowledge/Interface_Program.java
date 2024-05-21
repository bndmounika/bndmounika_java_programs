package basicKnowledge;

interface Keyword{
	void login();
}

public class Interface_Program implements Keyword {

	public static void main(String[] args) {
		Interface_Program IP = new Interface_Program();
		IP.login();
	}

	public void login() {
	System.out.println("Login");
	}

}
