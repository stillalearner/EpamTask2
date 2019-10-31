package InterestCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class siTest {

	@Test
	public void test() {
		InterestCal test= new InterestCal();
		DecimalFormat df= new DecimalFormat(".#");
		String result= df.format(test.simple_interest(1000, 10, 1));
		
		assertEquals("100.0",result);
	}

}
