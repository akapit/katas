package numbers.main;

import java.util.LinkedList;

public class NumbersQueue {
	LinkedList<Integer> queue = new LinkedList<Integer>();
	int n;
	String name;

	public NumbersQueue(String name) {
		this.name = name;
	}

	synchronized int getNumber() {
		while(queue.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return queue.removeFirst();
	}

	synchronized void add(int n) {
		queue.addLast(n);
		notify();
	}

	public int getSize()
	{
		return queue.size();
	}
	
	public boolean contains(int n){
		return queue.contains(n);
	}
	
}
