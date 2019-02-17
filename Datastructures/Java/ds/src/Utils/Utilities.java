package Utils;

import java.util.Comparator;

public class Utilities<E  extends Comparable<E>> implements Comparator<E> {

	// Utilities
	@Override
	public int compare(E Object1, E Object2) {
		return Object1.compareTo(Object2);
	}

}
