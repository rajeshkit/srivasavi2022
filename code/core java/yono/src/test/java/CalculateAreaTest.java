
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CalculateAreaTest {
	static CalculateArea c=null;
	@BeforeAll
	public static void tearUp() {
		System.out.println("Before All test is execute");
		
	}
	@AfterAll
	public static void tearDown() {
		System.out.println("After All test is execute");
	}
	@BeforeEach
	public void setUp() {
		c=new CalculateArea();
		System.out.println("Before each method");
		
	}
	@AfterEach
	public void setDown() {
		System.out.println("After each method");
		c=null;
	}
	// test cases -> one testing method expected , actual
	@Test
	public void testFindArea() {
		System.out.println("test find Area start");
		int actual=c.findArea(10);
		assertEquals(100, actual);
		System.out.println("test find Area end");
	}
	@Test
	public void testFindAreaArithmenicException() {
		assertThrows(ArithmeticException.class, ()->{c.findArea(0);});
	}
	@Test
	public void testAdd() {
		System.out.println("test find Add start");
		int result=c.add(23, 67);
		assertEquals(90, result);
		System.out.println("test find Add End");
		
	}
	@Test
	public void testFindAreaCube() {
		System.out.println("test find Area Cube start");
		float result = c.findArea(100, 10, 10);
		assertEquals(1000, result);
		System.out.println("test find Area Cube End");
		
	}
}
