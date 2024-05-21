package basicKnowledge;

public class WideningTypeCasting_converting_into_double {

	public static void main(String[] args) {
		double a =90;//Widening calling implicitly
		System.out.println(a);
		int age =43;
		double age1=age;
		System.out.println(age1);
		double ageofperson=(double)age;//explicitly 
		System.out.println(ageofperson);

	}

}
