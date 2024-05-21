package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Equals_array_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
	String name[] = new String[n];
	
	for(int i=0;i<name.length;i++)
		{
		name[i]= sc.next();
		
	}
	System.out.println(Arrays.toString(name));

String name2[] = new String[n];
	
	for(int i=0;i<name2.length;i++)
		{
		name2[i]= sc.next();
		
	}
	System.out.println(Arrays.toString(name2));
	
	if(Arrays.equals(name, name2)==true)
	{
		System.out.println("both the arrays are equals");
	}
	else
	{
		System.out.println("both the arrays are not equals");
	}
	}
	
	

}
