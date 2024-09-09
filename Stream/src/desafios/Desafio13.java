package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio13 {
	
	//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
	//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		numeros.stream()
			.filter( n -> n>=5)
			.filter(n -> n<=10)
			.forEach(n -> System.out.println(n));
			
		

		
		
			//.min(n -> n>5);
			//.max(n -> n<10)
			//.collect(Collectors.toList());
		
	}

}
