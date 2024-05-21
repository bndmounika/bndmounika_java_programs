package collections_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Program {

	public static void main(String[] args) {
 ArrayList a1 = new ArrayList();
 a1.add("Mouni");
 a1.add(20L);
 a1.add(true);
 a1.add("Hyderabad");
 System.out.println(a1);
 System.out.println(a1.size());
 Iterator i1= a1.iterator();
 //hasnext, next

 while(i1.hasNext())
 {
	 System.out.println(i1.next());
 }
 
	}

}
