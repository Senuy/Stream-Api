package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18 {
	
	//Verifique se todos os números da lista são iguais:
	//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

	public static void main(String[] args) {

		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		
		 List<Integer> numerosRepetidos = numeros.stream()
		            .filter(n -> numeros.stream().filter(x -> x.equals(n)).count() > 1) // Contar quantas vezes o número aparece o Stream de dentro itera com n do Stream de fora 
		            .distinct() // Remover duplicatas dos repetidos						// comparando os elementos de x é igual a n, se for maior que 1, ele permite o elemento dentro da stream
		            .collect(Collectors.toList());

		        System.out.println("Números repetidos: " + numerosRepetidos);

	}

}
