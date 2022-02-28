
public class Demo {
	String collegeName="Vasavi";// String literal Immutable
	
	public static void main(String[] args) {
		String collegeName="Vasavi";
		char c=collegeName.charAt(3);
		System.out.println(c);
		int l = collegeName.length();
		System.out.println(l);
		boolean b=collegeName.contains("r");
		System.out.println(b);
		String str = collegeName.replace("a", "w");
		System.out.println(str);
	}
}
