package basicKnowledge;
//Ass -75 Find out if 2 given strings are anagram of each other
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input ="loohcs";
		String input2="school";
		char[] a= input.toCharArray();
		char[] a2= input2.toCharArray();
		System.out.println("Before sorting ------>");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a);
		Arrays.sort(a2);
		System.out.println("After sorting----->");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2));
		if(Arrays.equals(a, a2))
		{
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
  
	}

}
