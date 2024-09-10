package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Desafio 3 - Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

public class Desafio03 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -1, 6, 7, 8, 9, -99, 5, 4, 3);

		List<Boolean> numerosPositivos = numeros.stream()
			.map(n -> n>0)
			.collect(Collectors.toList());

		System.out.println(numerosPositivos);
	}

}
