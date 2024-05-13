package basicKnowledge;
//Assignments 71 -In  a String Moun ika Bhim anad hi find out the number of spaces involved
import java.util.Arrays;

public class Arrays_countofspace {
static int countofspace =0;
	public static void main(String[] args)
	{
 String name ="Moun ika Bhim anad hi";
 char[] c=name.toCharArray();
 System.out.println(Arrays.toString(c));
  for(int i=0;i<c.length;i++)
  {
	 boolean answer = Character.isSpaceChar(c[i]);
	 if(answer == true)
	 {
		 countofspace++;
	 }
  }
  System.out.println(countofspace);
	}

}
