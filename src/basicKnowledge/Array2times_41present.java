package basicKnowledge;

import java.util.Arrays;

public class Array2times_41present {
 static int count=0;
	public static void main(String[] args) {
    int a[]=new int[4];
    a[0]=43;
    a[1]=41;
    a[2]=54;
    a[3]=41;
    int givennumber=41;
   System.out.println( Arrays.toString(a));
    for(int i=0;i<a.length;i++)
    {
    	if(givennumber==a[i])
    	{
    		System.out.println("Given number is present in an array at the index position is"+" "+i);
    		count++;
    	}
    	else
    	{
    		System.out.println("Given number is not present in an array at the index position is"+" "+i);
    	}
    }
    System.out.println(count);
	}

}
