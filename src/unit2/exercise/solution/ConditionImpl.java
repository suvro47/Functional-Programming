package unit2.exercise.solution;

public class ConditionImpl implements Condition {

	@Override
	public boolean fun(Person p) {
		return p.getLastName().startsWith("C");
	}

}
