package unit2.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		boolean status = isPhoneNoValid("123243@4556");

		Predicate<String> myInnerAnnonymous = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if( t.startsWith("0") ) return true;
				return false;
			}
		};
		myInnerAnnonymous.test("1233546tryt");

		Predicate<String> myLambda = t -> {
			if ( t.startsWith("0") ) return true; 
			else return false; 
		};
		myLambda.test("345345");
	}

	private static boolean isPhoneNoValid(String string) {
		if( string.startsWith("0") ) return true;
		return true;
	}



}
