package basicKnowledge;
// Ass -74 In the given array find out 41 is present or not. and display its count
import java.util.Arrays;

public class Array41_presentornot {

	public static void main(String[] args) {
	 int nos[]=new int[4];
	 nos[0]=71;
	 nos[1]=45;
	 nos[2]=32;
	 nos[3]=41;
	 int givennumber =41;
	 System.out.println(Arrays.toString(nos));
	 for(int i=0;i<nos.length;i++)
	 {
		if(givennumber==nos[i])
		{
			System.out.println(" Given number present in array at the index position"+" "+i);
		}
		else
		{
			System.out.println(" Given number not present in array at the index position"+" "+i); 

		}
	 }
	 
	 
	}

}
