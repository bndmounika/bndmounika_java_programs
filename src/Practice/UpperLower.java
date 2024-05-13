package Practice;

public class UpperLower {

	public static void main(String[] args) {
		String s="MouNiKa";
		String sLower = "";
		String sUpper = "";
		String su="";
		String su1="";
		for(int i=0;i<s.length();i++) {
			char Scopy	=s.charAt(i);
			//System.out.println(su);	
		
			if(Character.isLowerCase(Scopy)) {   
				sLower += Scopy;
				//sLower = sLower + Scopy;
				//System.out.print(Scopy);
			} else {
				sUpper += Scopy;
				//sUpper = sUpper + Scopy;
				//System.out.print(Scopy);
			}	
		}
		System.out.println(sLower);
		System.out.println(sUpper);
	}
}
