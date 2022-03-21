package lambdas;

public class calculoTeste {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();	
		System.out.println(calculo.executar(2, 3));
		
		Calculo multiplicar = new Multiplicar();
		System.out.println(multiplicar.executar(2, 3));
	}

}
