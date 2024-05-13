package Assignment;
//program - 95 Use the concept of asssertion with array
// program -88 Program to find the average of values of two arrays – one int array of size 4 and one double array of size 4.
public class Create_2_arrays {

	static int sum=0;
	static double sum1=0;
	static double average =0;
	static double average1 =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= new int[4];
		num[0]=8;
		num[1]=4;
		num[2]=5;
		num[3]=6;
	//	assert num.length>10;
		
		double num1[]= new double[4];
		num1[0] = 4.6;
		num1[1] = 3.5;
		num1[2] = 5.5;
		num1[3] = 6.2;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			sum1=sum+num1[i];
			
			average =average+sum/num.length;
			average1=average1+sum1/num1.length;
		}
		System.out.println(average);
		System.out.println(average1);
		
	}

}
