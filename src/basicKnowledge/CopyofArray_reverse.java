package basicKnowledge;

import java.util.Arrays;

public class CopyofArray_reverse {

	public static void main(String[] args) {
		
		String name[]=new String[3];
		name[0]="Mani";
		name[1]="Mouni";
		name[2]="Siri";
		String namecopy[] = new String[3];
		String rev=" ";
		for(int i=name.length-1;i>=0;i--)
		{
			namecopy[i]=name[(name.length-1)-i];
			//i=2, name[2-name.lenght]
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));
	}

}
