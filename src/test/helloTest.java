package test;

import static org.junit.Assert.*;

import org.junit.Test;
import test.hello;
public class helloTest {
	
	private hello he=new hello();
	
	@Test
	public void test1() {
		double []values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 };
		double result=he.calculate(values);
		assertEquals(0.27333,result,0.001);
	}
	@Test
	public void test2() {
		double []values = new double[] { 0.33, 1.33,1.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 };
		double result=he.calculate(values);
		assertEquals(0.292,result,0.001);
	}
	@Test
	public void test3() {
		double []values = new double[] { 0.33, 1.33,1.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 1.292, 0.667 };
		double result=he.calculate(values);
		assertEquals(0.3,result,0.001);
	}
}
