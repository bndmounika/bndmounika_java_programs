package basicKnowledge;

public class Widening_Program {

	public static void main(String[] args) {
		//implicity syntax
		double a =90;
		System.out.println(a);
		int age =28;
		double agepfperson = age;
		System.out.println(agepfperson);
		// explicit Syntax
		double agepfperson1 = (double)age;
		System.out.println(agepfperson);
		// narrowing example : narrowing can be done using Explicitly
		double pi=3.14;
		int pivalue  =(int) pi; 
		
	}

}
