package basicKnowledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
try {
int age = sc.nextInt();
System.out.println(age);
}
catch(InputMismatchException e){
	System.out.println("I am getting Exception");
}
catch(NullPointerException e1){
	System.out.println("I am getting IndexOutOfBoundsExceptio");
}

	}

}
