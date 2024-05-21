package collections_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_and_SetProgram {

	public static void main(String[] args) {
		System.out.println("Discussing about List");
		List a1 = new ArrayList();// super class = child class
		a1.add("mouni");
		a1.add(20L);
		a1.add(true);
		a1.add("hyd");
		a1.add("mouni");
		System.out.println(a1);//list follow index
		//order of insertion= true
		System.out.println("Discussing about Set");
		Set a2 = new HashSet();
		a2.add("mouni");
		a2.add(20L);
		a2.add(true);
		a2.add("hyd");
		a1.add("mouni");
		System.out.println(a2);// set don't follow indexing rather they follow hashcode value
		//order of insertion= False
	}

}
