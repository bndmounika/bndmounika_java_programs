package Practice;

import java.util.Arrays;

public class CountofSpace {
	static int countofspace=0;
	public static void main(String[] args) {
	 
		String name="naga durga mouni ka";
		char[] c =name.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++) {
		boolean answ =Character.isSpaceChar(c[i]);
		if(answ == true)
		{
			countofspace++;
		}
		
		}
		System.out.println("Count of spaces in string are  " +countofspace);
	}

}
