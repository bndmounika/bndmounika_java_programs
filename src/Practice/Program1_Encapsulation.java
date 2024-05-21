package Practice;
class Aplication1_Amazon
{
	private String email="bnd@gmail.com";


public String getter()
{
	return email;
}
public void setter(String email)
{
	//System.out.println(email);
	this.email= email;
}
}
public class Program1_Encapsulation {
	public static void main(String[] args)
	{
		Aplication1_Amazon a = new Aplication1_Amazon();
		a.setter("Mounika");
		System.out.println(a.getter());
	}
	
}
