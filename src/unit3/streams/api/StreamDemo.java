package unit3.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import unit1.lambda.expression.Person;

public class StreamDemo {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList (
				new Person("S", "T", 12),
				new Person("U", "F", 30),
				new Person("P", "R", 12),
				new Person("W", "X", 45)
				);

		people.stream()
			.map( person -> person.getAge() )  // stream the people list as age list
			.collect(Collectors.toSet())   // collect as set
			.forEach( person -> System.out.println(person) );

		people.stream()
			.map( person -> person.getFirstName() )  // stream the people list as name list
			.mapToInt( name -> name.length() )
			.forEach( person -> System.out.println(person));
		
		boolean allPersonAgeGreaterThan30 = people.stream()
			.allMatch( person ->  ( person.getAge() > 30 ) );

	}

}
