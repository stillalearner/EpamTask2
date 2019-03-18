package Calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MultiplyNumbersTest {

	@Test
	public void test() {

		Calculator test= new Calculator();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		int output= test.multiply_numbers(list);
		assertEquals(1680, output);
	}

}
