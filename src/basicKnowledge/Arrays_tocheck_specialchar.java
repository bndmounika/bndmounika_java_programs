package basicKnowledge;
import java.util.Arrays;
/* Assignment 72 In  a String Mouni 123@&$
find out the number of specail characters involved*/
public class Arrays_tocheck_specialchar {
 	
 static int countofalpha=0;
 public static void main(String[] args) {
	 String name ="Mouni 123@&$";
	 char[] c1 = name.toCharArray();
	 System.out.println(Arrays.toString(c1));
	// System.out.println(c1.length);
	 for(int i=0;i<c1.length;i++) {
		 boolean answer1 =Character.isAlphabetic(c1[i]);
		 boolean answer2=Character.isDigit(c1[i]);
		 boolean answer3 =Character.isSpaceChar(c1[i]);
		// if((Character.isAlphabetic(c1[i]))||(Character.isDigit(c1[i]))||(Character.isSpaceChar(c1[i])))
		 if ((answer1) || (answer2) || (answer3)) {
			 countofalpha++;
		 }
	 }
	// System.out.println(countofalpha);
	 int a=c1.length;
	 int b=countofalpha;
	 int SpecialChar =0;
	 SpecialChar = (a-b);
	 System.out.println(SpecialChar);
	
	}}

