package basicKnowledge;
/*Program - 394:-Program to demonstarte THIS() CALLING statement
*/
public class ThisCallingStmt1 {
	
	ThisCallingStmt1(){
		this(100);
		System.out.println("1");
	}
	ThisCallingStmt1(int a)
	{
		this(3.45);
		System.out.println("2");
	}
	ThisCallingStmt1(double a){
		System.out.println("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisCallingStmt1 obj = new ThisCallingStmt1();
		
	}

}
