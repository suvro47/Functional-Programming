package unit3.functional.interfaces;


/*
 * Remember we don't have a function type in java that all the lambda expression are typed as
 * We have reused the interface type as lambda type. What is the reason behind it ? 
 * 
 * The most important reason is backward compatibility. Suppose you have a library that receive 
 * a lambda expression as parameter , now it this lambda is typed with an FunctionType then
 * if you want to pass another lambda through this library then you have to re-write this library
 * in order to accept new lambda functionType. Now as lambda is interface typed then any lambda
 * matched with this interface can be passed through this library as argument.. simple ..!!! 
 */

public class RunableInterface {

	public static void main(String[] args) {
		
		Thread myThread = new Thread( new Runnable() {
			
			public void run() {
				System.out.println("Inline Anonymous Inner Runnable!");
			}
		});
		myThread.run();
		
		Runnable lambdaRunnable = () -> System.out.println("Inline Lambda Implementation Runnable");
		Thread myLambda = new Thread(lambdaRunnable);
		// Thread myLambda = new Thread(() -> System.out.println("Lambda Runnable"));
		myLambda.run();
	}

}
