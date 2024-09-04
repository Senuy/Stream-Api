package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class consumerExample {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * Consumer<Integer> imprimirNumeroPar = numero ->{ if(numero % 2 ==0) {
		 * System.out.println(numero); } };
		 */

		/*
		 * numeros.stream().forEach(new Consumer<Integer>() {
		 *	 public void accept(Integer n) { 
		 *		if(n%2==0) {
		 *			 System.out.println(n);
		 *		 }
		 * 
		 * } });
		 */
		
		// é retirado o consumer para usar expressão lambda, aonde é necessário apenas o argumento e a lógica implementada sobre ele
		
		numeros
		.stream()
		.filter( n -> n%2 == 0)
		.forEach(n -> System.out.println(n));
	}

}
