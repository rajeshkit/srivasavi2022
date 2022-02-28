package polymorphismdemo;

public abstract class HeadOffice {
	public int a;
	public void apply() { //concrete method or implemented method
		System.out.println("how to apply");
	}
	public abstract void proofVerification();// abstarct or unimplmented
}
abstract class ChennaiOffice extends HeadOffice{

	
	
}
abstract class APOffice extends HeadOffice{

	


	
}