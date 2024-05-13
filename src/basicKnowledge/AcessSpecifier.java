package basicKnowledge;

public class AcessSpecifier {

	public void add() {
		System.out.println("public");
	}

	private void sub() {
		System.out.println("private");
	}

	protected void mul() {
		System.out.println("protected");
	}

	void div() {
		System.out.println("default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcessSpecifier as = new AcessSpecifier();
		as.add();
		as.sub();
		as.mul();
		as.div();

	}

}
