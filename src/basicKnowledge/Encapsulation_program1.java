package basicKnowledge;

class A_program
{
	private int age=18;//72
	private String un="contact@gmail.com";
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd="grotechminds+_)";

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)//72
	{
		this.age=age;
	}	
}
public class Encapsulation_program1 
{
public static void main(String[] args) 
{
	A_program a1=new A_program();
	a1.setAge(72);
	System.out.println(a1.getAge());
	
	
}
}

