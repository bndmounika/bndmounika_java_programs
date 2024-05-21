package Practice;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[]= new String[n];
		s[0]="Mani";
		s[1]="Mouni";
		s[2]="Siri";
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
