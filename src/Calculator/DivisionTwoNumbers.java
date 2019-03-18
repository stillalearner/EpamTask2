package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTwoNumbers {

	@Test
	public void test() {

		Calculator test= new Calculator();
		int num1=6;
		int num2=2;
		int result= test.division_two_numbers(num1, num2);
		assertEquals(3,result);
	}

}
