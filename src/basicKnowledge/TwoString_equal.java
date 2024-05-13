package basicKnowledge;
// Assignment 66-How to check if two strings are equals to each other
import java.util.Scanner;

public class TwoString_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name="Mounika";
		Scanner sc = new Scanner(System.in);
		String name= sc.next();
		String name1= sc.next();
		
		if(name.equals(name1)==true)
		{
			System.out.println("both names are equal");
		}
		else {
			System.out.println("both names are not equal");
		}

	}

}
