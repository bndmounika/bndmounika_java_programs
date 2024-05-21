package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Check_41Presentotnot {
static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int n1[]= new int[n];
		for(int i=0;i<n1.length;i++)
		{
			n1[i]=sc.nextInt();
			
		if(n1[i]==41)
		{
			System.out.println("41 is present in "+i);
		}
		else
		{
			System.out.println("41 is not present "+i);
		}
		
		if((n1[i]==41)==true)
		{
			count++;
		}
		}
		
		System.out.println(Arrays.toString(n1));
		System.out.println("total 41 are present in array are "+count);

	}

}
