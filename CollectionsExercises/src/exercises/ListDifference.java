package exercises;

import java.util.ArrayList;
import java.util.List;

public class ListDifference {

	List<Integer> l = new ArrayList<Integer>();

	public List<Integer> generateRandomNumbers() {
		for (int i = 0; i < 100; i++) {
			int j = (int) (Math.random() * 500);
			l.add(j);
		}

		return l;
	}
	
	public long accessNumber( List<Integer> collectionOfNumbers){
		long st = System.currentTimeMillis();
		for(int i = 0; i < 100; i++ ) {
			collectionOfNumbers.get(i);
		}
		return System.currentTimeMillis() - st;
	}

}
