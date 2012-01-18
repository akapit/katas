package numeros;

public class Consumer extends Thread {
	NumbersQueue fibonacciQ;
	NumbersQueue primesQ;
	int numbersLimit;

	public Consumer(NumbersQueue fibonacciQ, NumbersQueue primesQ,
			int numbersLimit) {
		this.fibonacciQ = fibonacciQ;
		this.primesQ = primesQ;
		this.numbersLimit = numbersLimit;
	}

	public void run() {
		for (int i = 0; i < fibonacciQ.getSize(); i++) {
			int currentNumber = fibonacciQ.getNumber();
			if (primesQ.contains(currentNumber))
				System.out.println(currentNumber);
				
		}		
	}
}
