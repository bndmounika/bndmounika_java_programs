package basicKnowledge;
//Assignment73 Find out if given input is a palindrome
import java.util.Scanner;
	
public class Palindrom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String s =sc.next();
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{   
				char a = s.charAt(i);
				rev = rev+a;
			}
			System.out.println(rev);
			if(s.equals(rev)) {
				System.out.println("Given input is palindrom"+rev);
			} else {
				System.out.println("it is not palindrom");
			}
	}
}
