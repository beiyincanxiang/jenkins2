package test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;


import org.junit.Test;
import test.NumsDAO;
import test.Nums;

public class NumsTest {
	@Test
	public void test1() {
		NumsDAO ndao=mock(NumsDAO.class);
		double []values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 };
		when(ndao.getNums(0)).thenReturn(values);
		Nums n=new Nums();
		n.ndao=ndao;
		double[] temp=n.getinfo(0);
		assertEquals(values,temp);
	}
	@Test
	public void test2() {
		NumsDAO ndao=mock(NumsDAO.class);
		double []values = new double[] { 0.33, 1.33,0.27333, 0.3, 0.501, 0.444, 0.44, 0.34496, 0.33,0.3, 0.292, 0.667 };
		double []values2=new double[] {0.1,0.2};
		when(ndao.getNums(0)).thenReturn(values);
		Nums n=new Nums();
		n.ndao=ndao;
		double[] temp=n.getinfo(0);
		assertEquals(values2,temp);
	}

}
