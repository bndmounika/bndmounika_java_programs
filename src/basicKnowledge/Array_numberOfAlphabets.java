package basicKnowledge;
//Assignment 69 -n  a String Mounika find out the number of alphabets involve
import java.util.Arrays;

public class Array_numberOfAlphabets {
	static int countofalpha=0;
	public static void main(String[] args)
	{
		
String name ="mounika bhi";
char[] c1 = name.toCharArray();
System.out.println(Arrays.toString(c1));
for(int i=0;i<c1.length;i++)
{
boolean answer =Character.isAlphabetic(c1[i]);
if(answer==true)
{
	countofalpha++;
}

}
System.out.println(countofalpha);
}}


