package basicKnowledge;
//Assignment 81 to 84
public class MatchesFunction {

	public static void main(String[] args) {
		String input ="Mounika";
		System.out.println(input.matches("M(.*)"));
		System.out.println(input.matches("(.*)a"));
		String input2="sugar";
		System.out.println(input2.matches("....."));
		String a1="school";
		int a2=a1.lastIndexOf('o');
		System.out.println(a2);
		
	}

}
