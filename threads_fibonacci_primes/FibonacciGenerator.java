package numeros;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator implements NumbersGenerator
{
	List<Integer> result = new ArrayList<Integer>();
	
	public FibonacciGenerator(int limit){
		int f1, f2 = 1;
		int f3 = 1;
		
		for (int i = 1; f3 <= limit; i++) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			result.add(f3);
		}
	}
	
	@Override
	public List<Integer> getResult(){
		return result;
	}
}
