package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois	 = n -> n + 2;
		
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultadoUm = maisDois //=2
				.andThen(vezesDois)// 2*2
				.andThen(aoQuadrado)// 4 ao quadrado = 4*4 = 16
				.apply(0);
		System.out.println(resultadoUm);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
	}

}
