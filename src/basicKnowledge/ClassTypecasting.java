package basicKnowledge;
class Parent3{
	void parent()
	{
		System.out.println("Parent");
	}
}
public class ClassTypecasting extends Parent3{

	public static void main(String[] args) {
		Parent3 p	= new ClassTypecasting();//implicitly
		Parent3 p1	= (Parent3)new ClassTypecasting();//explicitly
	}

}
