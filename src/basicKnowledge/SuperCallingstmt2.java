package basicKnowledge;

import java.util.Scanner;

class College{
	College(String s1,double d,float f)
	{
		System.out.println("College");
	}
	College()
	{
		
	}
}
class School extends College{
	School(int a,int b,String s)
	{
		super("mouni",45.4,56.78f);
		System.out.println("School");
	}
	
}
public class SuperCallingstmt2 {
	public static void main(String[] args) {
		School s = new School(2,5,"mani");
		
		
		
	}
	

}
