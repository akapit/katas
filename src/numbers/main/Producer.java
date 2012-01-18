package numbers.main;

import java.util.List;

import numbers.util.NumbersGenerator;

public class Producer implements Runnable {
	NumbersGenerator generator;
	NumbersQueue queue;
	
	public Producer(NumbersQueue queue, NumbersGenerator generator) {
		this.generator = generator;
		this.queue = queue;
	}

	public void run() {
		List<Integer> numbers = generator.getResult();
		
		for (Integer n: numbers){
			queue.add(n);
		}
	}

}
