package unit2.exercise.solution;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Person) o1).getLastName().compareTo(((Person) o2).getLastName());
	}

}
