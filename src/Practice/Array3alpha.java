package Practice;

import java.util.Arrays;

public class Array3alpha {
static int countofalpha=0;
	public static void main(String[] args) {
 String name="viradhya123";
 char[] c =name.toCharArray();
 System.out.println(Arrays.toString(c));

 for(int i=0;i<c.length;i++)
 {
	boolean b = Character.isAlphabetic(c[i]);
	if(b==true)
	{
		countofalpha++;
	}
 }
 System.out.println("the total count of alpha"+" " +countofalpha);
	}

}
