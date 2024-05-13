package Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
//Assignment 98 
public class TryCatchblock {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String[] name = new String[n];
			name[0] ="Ram";
			name[1] ="Sita";
			name[2] ="Laxman";
			name[3] ="Hanuman";
			for(int i=0;i<name.length;i++) {
				System.out.println(name[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("handling ArrayIndexOutOfBoundsException");
	    }
		catch(InputMismatchException e2)
		{
			System.out.println("handling InputMismatchException");
		}
	}

}
