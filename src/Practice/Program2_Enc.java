package Practice;
class App{
	private int age=28;
	private String Uname ="Mounika";
	private String Pswd ="123";
	public int getAge() {
		return age;
		
	}
	public String getUname() {
		return Uname;
		
	}
	public String getPswd() {
		return Pswd;
		
	}

	public void setAge(int age,String Uname,String Pswd) {
		this.age = age;
		this.Uname=Uname;
		this.Pswd =Pswd;
	}
	
}
public class Program2_Enc {

	public static void main(String[] args) {
		App ap= new App();
		ap.setAge(29,"Mani","321");
		System.out.println(ap.getAge());
		System.out.println(ap.getUname());
		System.out.println(ap.getPswd());
	}

}
