package pitest.examples.example;
public interface Printer {
	public static final Printer DEFAULT_PRINTER = System.out::println;
	void print(String text);
}