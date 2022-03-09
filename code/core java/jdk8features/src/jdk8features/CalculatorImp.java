package jdk8features;

public class CalculatorImp{

	public static void main(String[] args) {
		Calculator c=(a,b)->System.out.println("Welcome"+(a+b));
		c.add(46,24);
	}

	
}
