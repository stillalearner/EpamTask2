package InterestCalculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void test() {

		InterestCalculator test= new InterestCalculator();
		DecimalFormat df= new DecimalFormat(".#");
		String result= df.format(test.compound_interest(1000.5, 10, 1.5));

		assertEquals("1154.3",result);
	}

}
