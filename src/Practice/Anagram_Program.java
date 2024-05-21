package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1="beard";
	    char n[] = s.toCharArray();
	    char n1[] =s1.toCharArray();
	    System.out.println("before sorting");
	    System.out.println(Arrays.toString(n));
	    System.out.println(Arrays.toString(n1));
	   Arrays.sort(n);
	   Arrays.sort(n1);
	   System.out.println("After sorting");
	   System.out.println(Arrays.toString(n));
	   System.out.println(Arrays.toString(n1));
	 if(Arrays.equals(n, n1)==true)
	 {
		 System.out.println("both are annagram");
	 }
	 else
	 
		 {
			 System.out.println("both are not annagram");
		 }
	 
		
		
	}

}
