package Practice;

import java.util.Scanner;

public class Averag_array {

	static int sum=0;
	static double sum1=0;
	static double  average=0;
	static double  average1=0;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//assert n==3;
		int arr[] = new int[n];
		double arr1[]= new double[n];
		for(int i=0;i<arr.length;i++)
		{
		//	assert i==0;
			arr[i]=sc.nextInt();
			arr1[i]=sc.nextDouble();
		//	System.out.println(arr[i]);
		//	System.out.println(arr1[i]);
			sum = sum+arr[i];
			sum1 =sum1+arr1[i];
		   average =sum/arr.length;
		   average1=sum/arr1.length;
		}
		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(average);
	}

}
