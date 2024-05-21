package Practice;

import java.util.Arrays;

public class Countofalpha {
	
	static int countofalpha =0;
	public static void main(String[] args) {
    String name ="manikanta123";
    char c[] = name.toCharArray();
  System.out.println(Arrays.toString(c));
  for(int i=0;i<c.length;i++) {
	  
  boolean answer =Character.isAlphabetic(c[i]);
  if(answer==true)
  {
	  countofalpha++;
  }
  }
  System.out.println("count of alphabetics are "+countofalpha);
	}

}
