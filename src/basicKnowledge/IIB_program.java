package basicKnowledge;

public class IIB_program {

	IIB_program()
	{
		System.out.println("Constructor");
	}
	static {//SIB
		
		System.out.println("SIB");
	}
static {//SIB
		
		System.out.println("2nd SIB");
	}
	{//IIB
		System.out.println("IIB");
	}
	{//IIB
		System.out.println("2nd IIB");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		IIB_program i1 = new IIB_program();
		IIB_program i2 = new IIB_program();
	}

}
