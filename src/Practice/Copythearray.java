package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Copythearray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =	sc.nextInt();
		String name[]=new String[n];
		String namecopy[]=new String[name.length];
	 for(int i=0;i<name.length;i++) {
		 name[i]=sc.next();
		 System.out.println(name[i]);
		 namecopy[(namecopy.length-1) -i]=name[i];
		}
	
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));
	}

}
