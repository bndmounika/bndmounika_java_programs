package basicKnowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      int[] n = new int[3];

      for(int j=0;j<n.length;j++)
       {
	     System.out.println("Enter the Array");
	     n[j]=sc.nextInt();
	   
        }
      System.out.println(Arrays.toString(n));
	}

}
