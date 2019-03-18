package InterestCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class SimpleInterestTest {

	@Test
	public void test() {
		InterestCalculator test= new InterestCalculator();
		DecimalFormat df= new DecimalFormat(".#");
		String result= df.format(test.simple_interest(1000, 10, 1));
		
		assertEquals("100.0",result);
	}

}
