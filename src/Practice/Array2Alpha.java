package Practice;

import java.util.Arrays;

public class Array2Alpha {
 static int countofanswer=0;
	public static void main(String[] args) 
	{
String name ="Sirii234";
char[] c=name.toCharArray();
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i++)
{
boolean answer=	Character.isAlphabetic(c[i]);
if(answer ==true)
{
	countofanswer++;
}
}
System.out.println(countofanswer);
	}

}
