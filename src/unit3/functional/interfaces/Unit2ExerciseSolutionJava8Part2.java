package unit3.functional.interfaces;

/*
 * No need to create functional Interface to write lambda expression
 * Java designers provide you all the possible functional Interface 
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import unit2.exercise.solution.Person;

public class Unit2ExerciseSolutionJava8Part2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList (
				new Person( "Circu", "Cimus", 21),
				new Person( "Marku", "Pimus", 24),
				new Person( "Tumms", "Simus", 25),
				new Person( "Cmuss", "Oimus", 20)
				);

		// compare(T , T ) , return boolean;  Comparator interface
		Collections.sort( persons , (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) );

		// test(T) return boolean; Perdicate Interface
		printConditionally( persons, p -> p.getLastName().startsWith("C") );

		// passing another behavior 
		// test(T) return boolean; Perdicate Interface | accept(T) return void Consumer interface
		performConditionally( persons, p -> p.getLastName().startsWith("C") , p -> System.out.println(p) );

	}

	private static void printConditionally(List<Person> persons, Predicate<Person> perdicate ) {

		for( Person p : persons ) {
			if( perdicate.test(p) ) {
				System.out.println(p);
			}
		}
	}

	private static void performConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for( Person p : persons ) {
			if( predicate.test(p) ) {
				consumer.accept(p);
			}
		}
		
	}

}
