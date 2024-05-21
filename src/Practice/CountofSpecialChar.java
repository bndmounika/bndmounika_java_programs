package Practice;

import java.util.Arrays;

public class CountofSpecialChar {
static int countofspecial=0;
	public static void main(String[] args) {
	String name ="BH Naga Durga Mounika 507 *($%^";
	System.out.println("Length of an array "+name.length());
	char[] sp =name.toCharArray();
	System.out.println(Arrays.toString(sp));
	for(int i=0;i<sp.length;i++) {
	boolean alpha =Character.isAlphabetic(sp[i]);
	boolean numer =Character.isDigit(sp[i]);
	boolean space = Character.isSpaceChar(sp[i]);
	if((alpha||numer||space)==false)
	{
		countofspecial++;
	}
	}
	System.out.println("Count of specialchars "+countofspecial);


	}

}
