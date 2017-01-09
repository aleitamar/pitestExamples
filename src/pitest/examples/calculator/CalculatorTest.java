package pitest.examples.calculator;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {
	private Calculator calculator;
	
	@Test
	public void divide_twoNumbers_returnsQuotient() throws Exception {
		calculator = new Calculator();
		int result = calculator.divide(8, 2);
		assertTrue(result == 4);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void divide_dividingByZero_throwsException() throws Exception {
		calculator = new Calculator();
		thrown.expect(RuntimeException.class);
		calculator.divide(9, 0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void divide_dividingByZero_throwsException_Final() throws Exception {
		calculator = new Calculator();
		thrown.expect(DivisionByZeroException.class);
		thrown.expectMessage("Can't divide by zero!");
		calculator.divide(9, 0);
	}
}
