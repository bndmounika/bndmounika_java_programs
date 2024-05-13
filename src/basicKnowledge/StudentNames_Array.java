package basicKnowledge;
//Assignment 62 -Create an array for Student,rollno,Gender
public class StudentNames_Array {

	public static void main(String[] args) 
	{
		//declare and initialize an array
    String names[] =new String[3];
    names[0]="Mouni";
    names[1]="Mani";
    names[2]="Siri";

	int rollno[]= new int[3];
	rollno[0]=23;
	rollno[1]=43;
	rollno[2]=34;
	char gender[]= new char[3];
	gender[0]='F';
	gender[1]='M';
	gender[2]='F';
	for(int i=0;i<names.length;i++)
	{
	System.out.println("Studentnames"+" "+"Rollno"+" "+"gender");
	System.out.println(names[i]+"            "+rollno[i]+"  "+gender[i]);
    
}	

}
}
