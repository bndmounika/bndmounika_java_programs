
package basicKnowledge;

class Amazon_application
{
	private String un ="Mouni";
	
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
	this.un =un;	
	}
}
public class Encapsulation_program {
	
	public static void main(String[] args) 
	{
		Amazon_application a1 = new Amazon_application();
        a1.setUn("BND");
        System.out.println(a1.getUn());

	}

}
