package designpatterndemo;

public class SingletonDesignDemo {
	private static SingletonDesignDemo sd=null;
	private SingletonDesignDemo() {
		
	}
	public static SingletonDesignDemo getInstance() {
		if(sd!=null) {
			return sd;
		}
		sd=new SingletonDesignDemo();
		return sd;//202020
	}
	
}
class Demo3{
	public static void main(String[] args) {
		SingletonDesignDemo d = SingletonDesignDemo.getInstance();
		SingletonDesignDemo e =SingletonDesignDemo.getInstance();
	
		
	}
}