package collections_programs;

import java.util.ArrayList;

public class Collection_program1 {

	public static void main(String[] args) {
ArrayList a1 = new ArrayList();
a1.add("Mouni");
a1.add(17L);
a1.add("Delloite");
a1.add(true);
a1.add("hyderabad");
a1.remove(0);
a1.remove(17L);
System.out.println(a1);
//a1.clear();

System.out.println("After clearing"+a1);
boolean answer = a1.isEmpty();
System.out.println(answer);
ArrayList a2 = new ArrayList();

a2.addAll(a1);
a2.add(1, 20L);
a2.addAll(0,a1);
System.out.println("Before removing" +a2);
//a2.removeAll(a1);
//System.out.println("After removing" +a2); 
ArrayList a3 = new ArrayList();
a3 = (ArrayList)a2.clone();
System.out.println("Aftercloning a3 is made just replica of a2"+a3);

	}

}
