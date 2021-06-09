package unit2.functional.interfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
	
		Integer ans = subtractFirstBySecond(10,20);
		System.out.println(ans);
		
		BiFunction<Integer, Integer, Integer > annonymousInnerImpl = new BiFunction<Integer, Integer, Integer >() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t - u;
			}
		};
		System.out.println(annonymousInnerImpl.apply(40, 10));
		
		BiFunction<Integer, Integer, Integer > myLambda = (t,u) -> t-u;
		System.out.println( myLambda.apply(10, 5) );
		
	}

	private static Integer subtractFirstBySecond(Integer i, Integer j) {
		return i - j;
	}
	
	

}
