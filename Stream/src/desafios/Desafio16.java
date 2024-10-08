package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio16 {

	// Agrupe os números em pares e ímpares:
	// Utilize a Stream API para agrupar os números em duas listas separadas, uma
	// contendo os números pares e outra contendo os números ímpares da lista
	// original, e exiba os resultados no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List pares = numeros.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(pares);

		List impares = numeros.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		System.out.println(impares);

	}

}
