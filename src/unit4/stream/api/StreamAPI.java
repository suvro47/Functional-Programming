package unit4.stream.api;

import java.util.Arrays;
import java.util.List;

import unit2.exercise.solution.Person;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList (
				new Person( "Circu", "Cimus", 21),
				new Person( "Marku", "Pimus", 24),
				new Person( "Tumms", "Simus", 25),
				new Person( "Cmuss", "Oimus", 20)
				);
		
		persons.stream()
		    .filter( p -> p.getLastName().startsWith("C"))
			.forEach( p -> System.out.println(p.getFirstName()));
		
		
	}

}
