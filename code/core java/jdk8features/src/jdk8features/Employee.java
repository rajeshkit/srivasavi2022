package jdk8features;

public interface Employee {
	
	void add();
	int multi(int a,int b);
	
	default void area() {
		System.out.println("Area is implemented method");
	}
	
	static void sum() {
		System.out.println("sum impementation");
	}

}
