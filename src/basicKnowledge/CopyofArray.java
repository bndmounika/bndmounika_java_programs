package basicKnowledge;
// Assignment -76 Program to copy the value of one array into another and display both arrays
import java.util.Arrays;

public class CopyofArray {

	public static void main(String[] args) {
		String name[]= new String[4];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="hanuman";
		String namecopy[]= new String[name.length];
		for(int i=0;i<name.length;i++) {
			namecopy[i]= name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));

	}

}
