package basicKnowledge;
//Ass-99 Try , catch and finally keyword usage in one program
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_finally {

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
			System.out.println("I am getting nulllpointerException");
		}
		finally {
			System.out.println("Thank you visiting us");
		}
	}

}
