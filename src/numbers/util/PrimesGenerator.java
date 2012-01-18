package numbers.util;

import java.util.ArrayList;
import java.util.List;


public class PrimesGenerator implements NumbersGenerator {
	List<Integer> result = new ArrayList<Integer>();
	
	public PrimesGenerator(int limit)
	{
		int i;
		for (i = 1; i <= limit; i++) {
			int j;
			for (j = 2; j < i; j++) {
				int n = i % j;
				if (n == 0) {
					break;
				}
			}
			if (i == j)
				result.add(i);
		}

	}
	
	
	@Override
	public List<Integer> getResult() {
			return result;
	}

}
