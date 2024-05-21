package basicKnowledge;
class Parent1Super
{
	 Parent1Super(String s) {
		System.out.println("parent1");
	}
}
class Parent2Super extends Parent1Super
{
	
	Parent2Super(int a) {
		super("mounika");
		System.out.println("parent2");
	}
	
}
public class SuperCallingStmt extends Parent2Super{
	
 SuperCallingStmt(){
	
	 super(100);
	System.out.println("child");
	
}
	public static void main(String[] args) {
		new  SuperCallingStmt();
		
	}

}
