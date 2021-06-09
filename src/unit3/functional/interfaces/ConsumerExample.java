package unit3.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import unit2.exercise.solution.Person;

public class ConsumerExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList (
				new unit2.exercise.solution.Person("S", "T", 12),
				new Person("U", "F", 30),
				new Person("P", "R", 45),
				new Person("W", "X", 45)
				);

		// External Iterator
		for( Person person : people ) {
			System.out.println(person);
		}
		
		// Internal iterator
		people.forEach( new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
		});
		
		people.forEach( person -> System.out.println(person));
	
	}

}
