package Practice;

public class Acess_specifier_program {
	
	public void one(){
	 System.out.println(" one");
 }
	private void  two(){
	System.out.println(" two");
 }
	protected void three(){
	System.out.println(" three");
}
	void four(){
	System.out.println(" four");
}
	public static void main(String[] args) {
		Acess_specifier_program as = new Acess_specifier_program();
		as.one();
		as.two();
		as.three();
		as.four();
		
	}

}
