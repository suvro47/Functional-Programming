package unit1.lambda.basics;

public class LambdaDemo {

	public static void main(String[] args) {

		Greeting helloGreeting = new HelloGreetings();
		helloGreeting.perform();

		Greeting anonymousInnerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Inline Anonymous Inner Class Greetings!");
			}
		};
		anonymousInnerClassGreeting.perform();

		Greeting lambdaGreeting = () -> System.out.println("Inline lambda Implementation Greetings!");  
		lambdaGreeting.perform();

		// Note : at line no [17] we have created an implementation of Greeting interface without creating a class, by only implementing the abstract method 
		// what do you think these two types of implementation is same ? 
	}

}

interface Greeting {
	public void perform();
}

class HelloGreetings implements Greeting {
	public void perform() {
		System.out.println("Class Implementation Hello Greetings!");
	}
}
