package unit2.exercise.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit2ExerciseSolutionJava7 {

	public static void main(String[] args) {


		List<Person> persons = Arrays.asList (
				new Person( "Circu", "Cimus", 21),
				new Person( "Marku", "Pimus", 24),
				new Person( "Tumms", "Simus", 25),
				new Person( "Cmuss", "Oimus", 20)
				);

		// Answer of Q1 
		Collections.sort( persons, new ComparatorImpl() );
		
		Collections.sort( persons , new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Answer of Q2 
		for( Person p : persons ) {
			System.out.println(p);
		}

		// Answer of Q3
		LastNameBeginningWithC(persons);  // naive approach 

		printConditionally( persons, new ConditionImpl() );  // external implementation
		
		printConditionally( persons, new Condition() {

			@Override
			public boolean fun(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
	}

	// this soln is working fine... try make it more flexible
	private static void LastNameBeginningWithC(List<Person> persons) {

		for( Person p : persons ) {
			if(p.getLastName().startsWith("C"))
				System.out.println(p);
		}
	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		
		for( Person p : persons ) {
			if( condition.fun(p) ) System.out.println(p);
		}
	}
	
	
	
	
	

}

