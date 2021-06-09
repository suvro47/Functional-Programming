package unit4.stream.api;

public class MethodReference {

	public static void main(String[] args) {
		
		Thread t = new Thread( () -> printMessage() );
		t = new Thread( MethodReference::printMessage );  // static method - classname::methodname
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Helllo");
	}

}
