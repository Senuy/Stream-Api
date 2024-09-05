package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Desafio 1 - Mostre a lista na ordem numérica:
//Crie um programa que utlize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console
public class Desafio1 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		/*
		 * numeros.stream().sorted().forEach(new Consumer<Integer>() {
		 * 
		 * public void accept(Integer n) { System.out.println(n);
		 * 
		 * } });
		 */
		
		numeros.stream()
			.distinct()
			.sorted()
			.forEach(/*n -> System.out.println(n)*/ System.out::println);


	}

}
