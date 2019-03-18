package HouseConstructionCost;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class HouseConstructionCostTest {

	@Test
	public void test() {
		HouseConstructionCost test= new HouseConstructionCost();
		DecimalFormat df= new DecimalFormat(".#");
		
		String result= df.format(test.calculate_cost("high", 1562.52, true));
		System.out.println(result);
		assertEquals("3906300.0",result);
		
	}

}
