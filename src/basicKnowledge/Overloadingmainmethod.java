package basicKnowledge;

public class Overloadingmainmethod {

	public static void main(String[] args) {
	
System.out.println("1");
main("name");
	}
	public static void main() {
	
		System.out.println("2");

	}
	public static void main(String name) {
	
		System.out.println("3");

	}
	

}
