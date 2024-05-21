package collections_programs;

import java.util.Enumeration;
import java.util.Vector;

public class Program_Enumeration {

	public static void main(String[] args) {
    Vector v = new Vector();
    v.add("Mouni");
    v.add(20L);
    v.add("WorkFH");
    v.add(19.5);
    Enumeration e = v.elements();
    while(e.hasMoreElements()) {
    	System.out.println(e.nextElement());
    }
    
	}

}
