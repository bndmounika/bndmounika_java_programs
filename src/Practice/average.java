package Practice;

public class average {

	public static void main(String[] args) {
	int size =4;
	int a[] = new int[4];
	 a[0]=30;
	 a[1]=40;
	 a[2]=50;
	 a[3]=90;
	 int sum=0;
	 double avg =0;
	 double remainder =0;
	 for(int i=0;i<a.length;i++)
	 {
		 sum =sum+a[i];
		 avg = sum/a.length;
		 remainder = sum%a.length;
	 }
	 
	 System.out.println(sum);
	 System.out.println(avg);
	 System.out.println(remainder);
	}

}
