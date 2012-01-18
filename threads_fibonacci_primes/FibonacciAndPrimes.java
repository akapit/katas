package numeros;

public class FibonacciAndPrimes {

	
	public static void main(String[] args)
	{
		int numbersLimit = 1000000;
		NumbersGenerator fiboGenerator = new FibonacciGenerator(numbersLimit);
		NumbersGenerator primesGenerator = new PrimesGenerator(numbersLimit);
		NumbersQueue fiboQueue = new NumbersQueue("Fibonacci");
		NumbersQueue primesQueue = new NumbersQueue("Primes");
		
		Producer fibonacciProducer = new Producer(fiboQueue, fiboGenerator);
		Producer primesProducer = new Producer(primesQueue, primesGenerator);
		Consumer consumer = new Consumer(fiboQueue, primesQueue, numbersLimit);
		
		fibonacciProducer.start();
		primesProducer.start();
		consumer.start();
	}
}
