package Practice;

public class String_Matches_Program {

	public static void main(String[] args) {
	String input ="Mounika";
	 System.out.println(input.matches("M(.*)"));
	 System.out.println(input.matches("(.*)a"));
	 String input1 ="Siri";
	 System.out.println(input1.matches("...."));
	 String input2="Mani";
	 int a2= input2.lastIndexOf('n');
	 System.out.println(a2);
	 }

}
