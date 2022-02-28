package polymorphismdemo;

public class Iphone extends SmartPhone {
	@Override
	public void call() {
		System.out.println("advanced technology");
	}
	public static void main(String[] args) {
		Iphone i=new Iphone();
		i.call();
	}
}
