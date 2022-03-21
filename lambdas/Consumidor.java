package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("caneta",1.00,0.15);
		Produto p2 = new Produto("caderno",10.00,0.15);
		Produto p3 = new Produto("lapis",1.50,0.15);
		Produto p4 = new Produto("borracha",0.80,0.15);
		Produto p5 = new Produto("apontador",1.50,0.15);
		
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
