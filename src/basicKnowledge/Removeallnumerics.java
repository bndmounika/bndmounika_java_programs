package basicKnowledge;
//Assignment 77,78,79 
public class Removeallnumerics {

	public static void main(String[] args) {
    String input ="sirisha123";
    String output =input.replace('s', ' ');
    System.out.println(output);
    String output2=input.replace('s','d');
    System.out.println(output2);
   String output3=input.replaceAll("[a-z]","");
   System.out.println(output3);
   //Remove capital letters
   String input2="MounIKa";
   String output4=input2.replaceAll("[A-Z]", "");
   System.out.println(output4);
   
   String input3="mouni@234";
   String output5=input3.replaceAll("[0-9]", "");
   System.out.println(output5);

	}

}
