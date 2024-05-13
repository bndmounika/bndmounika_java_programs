package Assignment;
//program - 96 : Use the concept of asssertion with for loop
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sum=0;
 double ave=0;
 int n=5;
 for(int i=0;i<n;i++) {
	// assert n>100;
	 sum =sum+i;
	 ave = ave+sum/n;
	 
 }
 System.out.println(ave);
		
	}

}

