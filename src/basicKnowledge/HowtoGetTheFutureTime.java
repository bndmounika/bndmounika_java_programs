package basicKnowledge;
//Assignment - 60 program on DATE calss with past, future and present time

import java.util.Date;

public class HowtoGetTheFutureTime {

	public static void main(String[] args) 
	{
Date d=new Date();
System.out.println(d.getTime());
Date d1=new Date(d.getTime());//present date and time
System.out.println(d1);
Date d2= new Date(d.getTime()+(60*60*1000*24*1));//future date it is 1 day added 
System.out.println(d2);
//future for adding 3 days 
Date d3= new Date(d.getTime()+(60*60*1000*24*3));
System.out.println(d3);
//past date like yesterday
Date d4= new Date(d.getTime()-(60*60*1000*24*1));
System.out.println(d4);



	}
}
