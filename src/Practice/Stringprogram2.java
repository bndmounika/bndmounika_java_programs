package Practice;

import java.util.Scanner;

public class Stringprogram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[]= new String[n];
		for(int i=0;i<name.length;i++)
		{
			 System.out.println("Enter the name");
	      name[i] =  sc.next();
	      System.out.println(name[i]);
		}
	}

}
