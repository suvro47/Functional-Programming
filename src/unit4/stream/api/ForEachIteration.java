package unit4.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import unit2.exercise.solution.Person;

public class ForEachIteration {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList (
				new Person( "Circu", "Cimus", 21),
				new Person( "Marku", "Pimus", 24),
				new Person( "Tumms", "Simus", 25),
				new Person( "Cmuss", "Oimus", 20)
				);
		
		// external iterator :: you are controlling the iteration
		for( int i = 0; i < persons.size() ; i++ ) {
			System.out.println( persons.get(i));
		}
		
		for( Person p : persons ) {
			System.out.println(p);
		}
		
		// Internal Iterator : Java 8 
		persons.forEach( new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
			
		});
		
		persons.forEach( p -> System.out.println(p));
		
		persons.forEach( System.out::print);  // Method Reference : see the next file
	
	}

}
