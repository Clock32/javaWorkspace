package hw_02;

public class LambdaPractice2 {

	public static void main(String[] args) {

		
		
		
		Calculaotr<Integer> adder = (v1, v2) -> v1 * v2;
		Calculaotr<Integer> findMax = (v1, v2) -> v1 - v2;
		Calculaotr<String> combiner = (v1, v2) -> v1 + v2;

	}

	@FunctionalInterface

	interface Calculaotr<V> {

		V operate(V v1, V v2);
	}

}
