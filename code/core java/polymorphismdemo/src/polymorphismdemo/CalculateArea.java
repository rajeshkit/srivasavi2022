package polymorphismdemo;
public class CalculateArea {
	public void findArea(int side) {
		System.out.println("square");
		System.out.println(side*side);
	}
	
	public void findArea(float radius) {
		System.out.println("cricle");
		System.out.println(3.14f*radius*radius);
	}
	public void findArea(int length,int breadth) {
		System.out.println("rectange");
		System.out.println(length*breadth);
	}
	public void findArea(int length, int height, int base) {
		System.out.println("triangle");
		System.out.println(1/2*height+length*base);
	}
	public static void main(String[] args) {
		CalculateArea c=new CalculateArea();
		System.out.println();
		System.out.println(23);
		System.out.println('t');
		c.findArea(23);
		c.findArea(4.5f);
		c.findArea(56, 34);
		c.findArea(78, 23, 3);
	}
}
