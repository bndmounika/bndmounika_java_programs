package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Equals_arrays_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 boolean b[] = new boolean[n];
 
 for(int i =0;i<b.length;i++)
 {
	 b[i]= sc.nextBoolean();
 }
System.out.println(Arrays.toString(b));
	
	boolean b1[] = new boolean[n];
	 
	 for(int i =0;i<b1.length;i++)
	 {
		 b1[i]= sc.nextBoolean();
	 }
	System.out.println(Arrays.toString(b1));
	if(Arrays.equals(b, b1)==true)
	{
		System.out.println(" both values are equals");
	}
	else
	{
			System.out.println("both values are not equals");
	}
		}
	
}


