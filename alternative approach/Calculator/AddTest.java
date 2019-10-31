package Calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Calculator test= new Calculator();
		
		ArrayList<Integer> list2= new ArrayList<>();
		list2.add(10);
		list2.add(5);
		list2.add(4);
		int output2= test.add_numbers(list2);
		assertEquals(19, output2);
	}

}
