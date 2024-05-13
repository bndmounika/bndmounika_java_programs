package basicKnowledge;
//Assignment 67 -How to check if two Arrays are equals to each other
import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqualsMethods {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
        int rollno[] = new int[3];
          for(int i=0;i<rollno.length;i++)
           {
    	     rollno[i]=s.nextInt();
           }
             int rollno1[] = new int[3];
              for(int i=0;i<rollno1.length;i++)
               {
    	        rollno1[i]=s.nextInt();
                }
                 System.out.println(Arrays.toString(rollno));
                 System.out.println(Arrays.toString(rollno1));
                 if(Arrays.equals(rollno, rollno1)==true)
                    {
    	              System.out.println("both are equals");
    	              }
                     else
                         {
                     	System.out.println("both are not equal");
                         }
	}

}
