package Practice;

import java.util.Arrays;

public class Countofnumeric {
	static int count =0;
	public static void main(String[] args) {
	String name ="Mouni4567";
	char[] n = name.toCharArray();
	System.out.println(Arrays.toString(n));
	for(int i=0;i<n.length;i++) {
		
 boolean answer =Character.isDigit(n[i]);
 if(answer==true) {
	 count++;
 }
	}
	System.out.println("total numeric values are "+count);

	}

}
