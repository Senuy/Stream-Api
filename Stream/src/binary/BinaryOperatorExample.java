package binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


public class BinaryOperatorExample {
	
	public static void main(String[] args) {
		//criar uma lista de numero inteiros
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		// usaro BinaryOperator com expressao lambda para somar 2 numeros inteiros;
		
		BinaryOperator <Integer> somar = (n1,n2) -> n1+n2;
		
		int resultado = numeros.stream()
				.reduce(0,(n1,n2) -> n1+n2);
		
		System.out.println(resultado);
	}

}
