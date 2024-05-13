package basicKnowledge;
// Assignment 58 and 59 how to check if string is empty? and How to use substring
public class EmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Mouni";
		String name1="";
		System.out.println(name.isEmpty());
		System.out.println(name1.isEmpty());
		
		String name2= "Mounika Bhimanadhi";
		System.out.println(name2.substring(3));
		System.out.println(name2.substring(8));
		System.out.println(name2.substring(8,18));
		System.out.println(name2.substring(0,5));
		
	}

}
