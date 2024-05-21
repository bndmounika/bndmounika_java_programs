package collections_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_program2 {

	public static void main(String[] args) {
		System.out.println("Discussing about List");
		List a1 = new ArrayList();// super class = child class
		a1.add("mouni");
		a1.add(20L);
		a1.add(true);
		a1.add("hyd");
		//a1.add("mouni");
		System.out.println(a1);
		ListIterator i2= a1.listIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("***************");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
