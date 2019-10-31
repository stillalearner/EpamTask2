package InterestCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class ciTest {

	@Test
	public void test() {

		InterestCal test= new InterestCal();
		DecimalFormat df= new DecimalFormat(".#");
		String result= df.format(test.compound_interest(1000.5, 10, 1.5));

		assertEquals("1154.3",result);
	}

}
