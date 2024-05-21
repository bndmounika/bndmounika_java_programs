package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class String_programusingtostring {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n =sc.nextInt();
 String name[]= new String[n];
 for(int i=0;i<name.length;i++)
 {
	 System.out.println("Enter names");
	 name[i]= sc.next();
	 System.out.println(name[i]);
	
 }
 System.out.println(Arrays.toString(name));
	}

}
