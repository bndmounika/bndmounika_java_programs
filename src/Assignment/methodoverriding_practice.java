package Assignment;
class Parent{
	void add()
	{
		System.out.println("I am adding in parent Method ");
	}
}

public class methodoverriding_practice extends Parent{
	void add()
	{
		super.add();
		System.out.println("I am adding in child Method ");
	}
	public static void main(String[] args) {
		methodoverriding_practice ab = new methodoverriding_practice();
		ab.add();
	}

}
