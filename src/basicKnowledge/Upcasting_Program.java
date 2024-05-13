package basicKnowledge;
class Parentclass
{
	
}

public class Upcasting_Program extends Parentclass{

	public static void main(String[] args) {
		//Upcasting implicitly
		Parentclass p = new Upcasting_Program();
		//Upcasting Explicitly
		Parentclass p2 = (Parentclass) new Upcasting_Program();
		
	}
	

}
