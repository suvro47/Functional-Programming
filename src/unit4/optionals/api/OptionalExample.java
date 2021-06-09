package unit4.optionals.api;

import java.util.Optional;

// java optionals helps you to handle null pointer exception


public class OptionalExample {

	public static void main(String[] args) {
		
		Object value = Optional.ofNullable("Hello")
				.orElseGet( () -> "default value" );
		
		System.out.println(value);
		
		Object exception = Optional.ofNullable("Hello")
				.orElseThrow( () -> new IllegalStateException("Exception") );

		System.out.println(exception);
		
		Optional.ofNullable("John")
				.ifPresent( val -> {
				    // logic	
					System.out.println(val);
			    
			    });
	} 

}
