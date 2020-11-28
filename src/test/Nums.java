package test;
import test.NumsDAO;
public class Nums {
	public NumsDAO ndao; 
	public double[] getinfo(int id) {
		double[] result=ndao.getNums(id);
		return result;
	}
}
