package test;

import org.apache.commons.math3.stat.descriptive.rank.Min;

public class hello {
	public double calculate(double[] values) {
		Min min = new Min();
		double temp=min.evaluate(values);
		System.out.print(temp);
		
		if (temp>0.27 && temp<0.275)
			temp=temp;
		else
			temp=temp-2;
		
		
		return temp;
	}
}
