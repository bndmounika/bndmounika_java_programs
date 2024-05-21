package basicKnowledge;

public class DaimondProblemChild implements parent1,parent2 {
 void child()
 {
	 System.out.println("I am a child class");
 }
	public static void main(String[] args) {
		DaimondProblemChild d = new DaimondProblemChild();
		d.Grandparent();
		d.Parent1();
		d.Parent2();
		d.child();

	}
	public void Grandparent() {
		System.out.println("I am a grand Parent");
		
	}
	public void Parent2() {
		System.out.println("I am a 2nd Parent");
		
	}
	public void Parent1() {
		System.out.println("I am a 1st Parent");
		
	}

}
