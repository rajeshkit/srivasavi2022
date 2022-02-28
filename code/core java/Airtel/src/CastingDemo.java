
public class CastingDemo {
	public static void main(String[] args) {
		
		Object o;
		int a=90; // 32 bit
		short s=34; //16 bit
		
		s=(short)a; //explicit casting
		a=s; // implicit casting 
		long l=466;
		a=(int)l;
		
		char c='g';
	
		int rank=34;// primitive int value
		Integer r=34;// reference Integer 
		
		float cgpa=7.8f;
		Float c1=Float.valueOf(cgpa);
		float ff=c1.floatValue();
		
		char c11='t';
		Character ch=Character.valueOf(c11);// primitive to reference
		char c111 = ch.charValue();
		
		
		//String to primitive type
		Integer.parseInt("454");
		float ffff = Float.parseFloat("464.6f");
		double fff = Double.parseDouble("56776535");
		
		
	}
}
