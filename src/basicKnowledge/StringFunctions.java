package basicKnowledge;
//Assignment 18 -Write a program with help of String functions .length, charAt(), .concat(), .contains(), .touppercase(), .tolowercase() etc
public class StringFunctions {

	public static void main(String args[])
	{
		String name="Mouni";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('i'));
	    System.out.println(name.toUpperCase());
	    System.out.println(name.toLowerCase());
	    System.out.println(name.concat(" ").concat("Mani"));
	    String first_name="Mani";
	    String last_name="Mouni";
	    System.out.println(first_name.concat(" ").concat(last_name));
	   System.out.println(name.contains("Scho"));
	}
	
}
