package abstractiondemo;

public abstract class Phone {
	public void call() {// implemented or non abstract
		System.out.println("cellular technology");
	}
	public abstract void sms(); // unimplemented or abstract method

}

class Iphone extends Phone{

	@Override
	public void sms() {
		System.out.println("Airtel");	
	}	
} 

class Samasung extends Phone{

	@Override
	public void sms() {
		System.out.println("Vodafone");
		
	}
	
}