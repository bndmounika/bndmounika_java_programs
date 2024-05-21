package Practice;

import java.util.Scanner;

public class Palidrom_program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		System.out.println("Given string is "+s);
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			 rev = rev + s.charAt(i);
		}
		System.out.println("Reverse string is " +rev);
			 if(rev.equals(s))
			 {
				 System.out.println("both are palindroms");
			 }
			 else
			 {
				 System.out.println("both are not palindroms");
			 }
		
		

	}

}
