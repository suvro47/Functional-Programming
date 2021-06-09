package unit3.functional.interfaces;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Integer increment = incrementByOne(10);
		System.out.println(increment);
		
		Function<Integer, Integer> anonymousInnerImpl = new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t+1;
			}
		};
		System.out.println(anonymousInnerImpl.apply(10));
		
		Function<Integer,Integer> myLambda = t -> t + 1;   // inline lambda implementation
		System.out.println(myLambda.apply(10));
	}

	private static int incrementByOne(Integer i) {
		return  i + 1;
	}

}
