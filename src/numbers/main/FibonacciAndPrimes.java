package numbers.main;

import numbers.util.FibonacciGenerator;
import numbers.util.NumbersGenerator;
import numbers.util.PrimesGenerator;

public class FibonacciAndPrimes {
	
	public static void main(String[] args)
	{
		int numbersLimit = 100000;
		NumbersGenerator fiboGenerator = new FibonacciGenerator(numbersLimit);
		NumbersGenerator primesGenerator = new PrimesGenerator(numbersLimit);
		NumbersQueue fiboQueue = new NumbersQueue("Fibonacci");
		NumbersQueue primesQueue = new NumbersQueue("Primes");
		
		Producer fibonacciProducer = new Producer(fiboQueue, fiboGenerator);
		Producer primesProducer = new Producer(primesQueue, primesGenerator);
		Consumer consumer = new Consumer(fiboQueue, primesQueue, numbersLimit);
		
		new Thread(fibonacciProducer).start();
		new Thread(primesProducer).start();
		new Thread(consumer).start();
	}
}
