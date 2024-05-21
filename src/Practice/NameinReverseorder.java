package Practice;

public class NameinReverseorder {

	public static void main(String[] args) {
		String name="Viradhya";
		
		for(int i=name.length()-1;i>=0;i--)
		{
		char name2=	name.charAt(i);
		System.out.println(name2);
		}
		String s ="";
		System.out.println(s.isEmpty());
		System.out.println(name.isEmpty());
	}

}
