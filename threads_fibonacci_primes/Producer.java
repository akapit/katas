package numeros;

import java.util.List;

public class Producer extends Thread {
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
