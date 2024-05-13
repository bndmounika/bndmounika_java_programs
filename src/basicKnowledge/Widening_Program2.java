package basicKnowledge;

public class Widening_Program2 {

	public static void main(String[] args) {
		byte age =82;
		 long ageofperson = age; //implicitly
		 System.out.println(ageofperson);
		byte age1 =82;
		 long ageofperson1 = (long) age; //explicitly
		ageofperson1 =1000;
		System.out.println(ageofperson1);
		System.out.println("--------------");
		long marks =1000;

		byte m1=(byte) marks;//explicitly
		System.out.println(m1);
		System.out.println("-----------");
		int marks2 = 100;
		float ma1=marks2;//implicitly
		System.out.println(ma1);
		int marks3 =90;
		float ma2=(float) marks3;//explicitly
		System.out.println(ma2);


	}

}
