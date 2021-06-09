package unit2.exercise.solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit2ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList (
				new Person( "Circu", "Cimus", 21),
				new Person( "Marku", "Pimus", 24),
				new Person( "Tumms", "Simus", 25),
				new Person( "Cmuss", "Oimus", 20)
				);

		// Answer of Q1 
		Collections.sort(persons , (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );  // inline lambda implementation of Comparator Interface

		// Answer of Q2 
		printConditionally( persons , p -> true );
		
		// Answer of Q3
		printConditionally( persons, p -> p.getLastName().startsWith("C") );
	}

	private static void printConditionally(List<Person> persons, Condition condition) {

		for( Person  p : persons ) {
			if( condition.fun(p) ) System.out.println(p);
		}
	}
}