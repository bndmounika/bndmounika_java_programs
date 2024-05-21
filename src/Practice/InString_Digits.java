package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class InString_Digits {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] a =s.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
		boolean answer =	Character.isDigit(a[i]);
		if(answer == true)
		{
			count++;
		}
		
		}
		System.out.println(count);
		
		if(count == a.length)
		{
			System.out.println("Given string contains only digits");
		}
		else{  
	        System.out.println("Given string not contains only digits");  
	    }
		
			
		
	
}

}
