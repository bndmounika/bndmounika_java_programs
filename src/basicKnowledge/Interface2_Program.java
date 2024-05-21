package basicKnowledge;
//Ass -32 :-Program to demonstrate INTERFACE
interface Parent1{
  void login();
  void logout();
}
interface Parent2 extends Parent1{
	void signin();
	void signout();
}

public class Interface2_Program implements Parent2{

	public static void main(String[] args) {
		Interface2_Program i1 = new Interface2_Program();
		i1.login();
		i1.logout();
		i1.signin();
		i1.signout();

	}

	public void login() {
		System.out.println("I am from Parent 1");
		
	}

	public void logout() {
		System.out.println("I am from Parent 1");
		
	}

	public void signin() {
		
		System.out.println("I am from Parent 2");
	}

	public void signout() {
		
		System.out.println("I am from Parent 2");
	}

}
