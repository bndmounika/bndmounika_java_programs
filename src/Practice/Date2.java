package Practice;

import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		Date d1= new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()-(60*60*1000*24*5));
		System.out.println(d2);
		
		String input = d2.toString();
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
