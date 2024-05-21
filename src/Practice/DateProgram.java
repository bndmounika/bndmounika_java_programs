package Practice;

import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);
		
		
		String input = d1.toString();
		System.out.println(input);
		String Date =input.substring(8, 10);
		System.out.println(Date);
		String Month =input.substring(4, 7);
		System.out.println(Month);
		String year =input.substring(24);
		System.out.println(year);
		System.out.println(Date.concat(" ").concat(Month).concat(" ").concat(year));
		System.out.println(Date.concat("-").concat(Month).concat("-").concat(year));
		System.out.println(Date.concat("/").concat(Month).concat("/").concat(year));
	}

}
