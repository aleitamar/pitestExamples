package pitest.examples.calculator;

public class Calculator {

	public int divide(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			throw new DivisionByZeroException("Can't divide by zero!");
		}
		return firstNumber / secondNumber;
	}
}
