package numbers.util;

import java.util.ArrayList;
import java.util.List;

public class PrimesGenerator implements NumbersGenerator {
	List<Integer> result = new ArrayList<Integer>();

	public PrimesGenerator(int limit) {
		int i;
		for (i = 1; i <= limit; i++) {
			if (isPrime(i))
				result.add(i);
		}

	}

	private boolean isPrime(int n) {
		for (int i = 2; 2 * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public List<Integer> getResult() {
		return result;
	}

}
