package basicKnowledge;
import java.util.Date;
//Assignment 61 print o/p Date below format
//1)16 Apr 2024 
//2) 16-Apr-2024
//3) 16/Apr/2024
public class HowToGetPresentTime {

	public static void main(String[] args)
	{
     Date d1 = new Date();
    // Date d1=new Date(d.getTime());//
     //System.out.println(d1);
     
      String input =d1.toString();
      String month = input.substring(4,7);
     System.out.println(month);
     String date = input.substring(8,10);
     System.out.println(date);
  String year = input.substring(input.length()-4);// or(24,28)or(24)
  System.out.println(year);
  System.out.println("--------------");
  System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
  System.out.println(date.concat("-").concat(month).concat("-").concat(year));
  System.out.println(date.concat("/").concat(month).concat("/").concat(year));
  //System.out.println(date+"/"+month+"/"+year);

   //  System.out.println(input);
		
	}

}
