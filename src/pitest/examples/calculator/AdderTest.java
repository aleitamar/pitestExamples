package pitest.examples.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdderTest {
	private Adder adder;
	
	@Test
	public void add_AddNumberToZero_returnsTheNumber() throws Exception {
		adder = new Adder();
		int result = adder.add(5, 0);
		assertTrue(result == 5);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void add_TwoNumbers_returnsSum() throws Exception {
		adder = new Adder();
		adder.add(3, 8);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void add_TwoNumbers_returnsSum_Final() throws Exception {
		adder = new Adder();
		int result = adder.add(3, 8);
		assertTrue(result == 3 + 8);
	}
}
