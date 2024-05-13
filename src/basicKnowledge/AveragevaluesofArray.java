package basicKnowledge;
/*Program 87 -Create a Array lengthsize[4]of int datatype find out the average of those 4 numbers*/
public class AveragevaluesofArray {
	static double average =0;
	static int sum =0;
	static double remainder =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num[]= new int [4];
num[0]=40;
num[1]=50;
num[2]=60;
num[3]=70;

for(int i=0;i<num.length;i++)
{
	sum=sum+num[i];
	average = sum/num.length;
	remainder = sum%num.length;
}
System.out.println(sum);
System.out.println(average);
System.out.println(remainder);
	}

}
