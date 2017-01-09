package pitest.examples.calculator;
public class DivisionByZeroException extends RuntimeException {
	public DivisionByZeroException(String message) {
		super(message);
	}
}