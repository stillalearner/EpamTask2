package Calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {

		Calculator test= new Calculator();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(2);list.add(3);list.add(4);list.add(5);list.add(1);
		int output= test.multiply_numbers(list);
		assertEquals(120, output);
	}

}
