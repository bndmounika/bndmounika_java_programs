package Practice;

import java.util.Arrays;

public class Countofalpha1 {
	static int count=0;
	public static void main(String[] args) {
		//int count =0;
		String name1 ="MounikaBnD507";
		System.out.println("Total name count is" +name1.length());
		char[] n =name1.toCharArray();
		System.out.println(Arrays.toString(n));
		for(int i=0;i<n.length;i++) {
		boolean answer = Character.isAlphabetic(n[i]);
		if(answer==true)
		{
			count++;
		}
		
		}
		System.out.println("Enter the alphabetics "+count);

	}

}
