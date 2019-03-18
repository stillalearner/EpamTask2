package Calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void test() {
		
		
		Calculator test= new Calculator();
		ArrayList<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		int output= test.add_numbers(list);
		assertEquals(26, output);
	}

}
