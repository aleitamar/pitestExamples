package pitest.examples.example;

public class GuessGame {
    private int secretNumber;
    Printer printer = Printer.DEFAULT_PRINTER;

	public GuessGame() {
		int DEFAULT_SECRET = 64;
		this.secretNumber = DEFAULT_SECRET;
	}

	public GuessGame(int secretNumber) {
		this(secretNumber, Printer.DEFAULT_PRINTER);
		this.secretNumber = secretNumber;
    }
    
	public GuessGame(int secretNumber, Printer printer) {
    	this.printer = printer;
    }
	
    public boolean guess(int value) {
    	boolean result = value == secretNumber;
        printResult(result);
		return result;
    }

    private void printResult(boolean result) {
    	if (result == true) {
    		printer.print("Right Guess. You WIN!!!");
    	} else {
    		if (result == true) {
    	    	doSomething();		
    		}
    		printer.print("WRONG. You LOST!!!");
    	}
    }

	private void doSomething() {
		//does something...
	}
}