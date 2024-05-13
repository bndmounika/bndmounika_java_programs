package basicKnowledge;
/*Program- 35 to demonstrate THIS KEYWORD*/
public class ThisKeyword {
	
	int age;
	String name;
	double salary;
	void student_details(int age,String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		//System.out.println("Name of the student is "+name+" " +"Age of the student is "+age+" " + "Salary of the student is "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword sd= new ThisKeyword();
		sd.student_details(28, "Mouni", 80000.9);
		System.out.println(sd.name);
		System.out.println(sd.age);
		System.out.println(sd.salary);
		
	}

}
