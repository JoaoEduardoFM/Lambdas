package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		// NÃO : Int -> Double
		// double -> Double
		
		BinaryOperator<Double> soma = (x, y) -> { return x + y; };	
		System.out.println(soma.apply(2.0, 6.0));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.apply(2.0, 3.0));
		
		BinaryOperator<Integer> soma1 = (x, y) -> { return x + y; };	
		System.out.println(soma1.apply(2, 3));
		
		soma1 = (x, y) -> x * y;
		System.out.println(soma1.apply(5, 6));
		
		
	}

}
