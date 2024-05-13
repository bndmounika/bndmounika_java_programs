package Assignment;
// Assignment63_and_64_Arrays Create an array for Student the size of array should be coming from the Scanner Class
import java.util.Arrays;
import java.util.Scanner;

public class Assignment63_and_64_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 int array[]= new int[3];
 
 for(int i=0;i<array.length;i++)
 {
	 array[i]= sc.nextInt();
 }
 System.out.println(Arrays.toString(array));

	}

}
