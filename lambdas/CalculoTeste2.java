package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo soma = (x, y) -> { return x + y; };	
		System.out.println(soma.executar(2, 6));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.executar(2, 3));
		
		System.out.println(soma.legal());
		System.out.println(Calculo.massa());
	}

}
