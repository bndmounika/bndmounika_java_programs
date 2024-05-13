package Assignment;
//Create an array with datatype boolean of size 3 and takes the value of array using Scanner class
import java.util.Scanner;

public class Assignment_68_Arrays_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
  boolean ar[]=new boolean[3];
 for(int i=0;i<ar.length;i++)
 {
	 ar[i]=sc.nextBoolean();
 }
 
 for(boolean value:ar)
 {
 System.out.println(value);
	}

}
}