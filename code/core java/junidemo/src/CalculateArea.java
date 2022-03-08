public class CalculateArea {
	public int findArea(int side) { // 10  expected 100
		if(side==0) {
			throw new ArithmeticException("side cannot be zero");
		}
		return side*side;
	}
	public int add(int no1,int  no2) {
		return no1+no2;
	}
	public float findArea(int length, int height, int base) {
		return 1/2*height+length*base;// 1/2*10+100*10
	}
	
}
