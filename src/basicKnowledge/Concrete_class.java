package basicKnowledge;
abstract class Abstract_class{
	abstract void add();
	
}

public class Concrete_class extends Abstract_class{

	public static void main(String[] args) {
		Concrete_class C = new Concrete_class();
       C.add();
	}

	@Override
	void add() {
		System.out.println("Addition");
		
	}

}
