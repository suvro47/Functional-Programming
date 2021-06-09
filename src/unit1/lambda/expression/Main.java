package unit1.lambda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList (
				new Person("S", "T", 12),
				new Person("U", "F", 30),
				new Person("P", "R", 45),
				new Person("W", "X", 45)
				);

		// Imperative Approach
		for( Person person : people ) {
			if( person.getAge() >= 30 ) {
				System.out.println(person);
			}
		}

		// Declartive Apprach
		people.stream()
				.filter( person -> person.getAge() >= 30 )
				.forEach( person -> System.out.println(person));

		List<Person> p = people.stream()
				.filter( person -> person.getAge() >= 30 )
				.collect(Collectors.toList());
		
		p.forEach( System.out::println );
	}

}
