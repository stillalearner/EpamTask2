package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Divtest {

	@Test
	public void test() {

		Calculator test= new Calculator();
		int num1=12;int num2=3;
		int result= test.division_two_numbers(num1, num2);
		assertEquals(4,result);
	}

}
