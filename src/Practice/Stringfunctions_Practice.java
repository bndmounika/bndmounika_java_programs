package Practice;

public class Stringfunctions_Practice {

	public static void main(String[] args) {
   String name="Manikanta";
   System.out.println(name.length());
   System.out.println(name.charAt(2));
   System.out.println(name.indexOf('i')); 
   System.out.println(name.toUpperCase());
   System.out.println(name.toLowerCase());
   System.out.println(name.concat(" is my husbands name "));
   String firstname = "T";
   String lastname ="Kanta";
   System.out.println(name.concat(lastname).concat(" ").concat(firstname));
   System.out.println(name.contains("kanta"));
   String name1="  online shopping     ";
   System.out.println(name1.trim());
	}

}
