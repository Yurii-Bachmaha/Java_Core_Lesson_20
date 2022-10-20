package task01;

public class Fibonacci {

	public static int fibonacci(int i) {
		if(i<=1)
			return i;
		return fibonacci(i-1) + fibonacci(i-2);
	}
}