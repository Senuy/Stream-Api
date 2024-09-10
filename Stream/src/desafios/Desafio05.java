package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

public class Desafio05 {
	//Desafio 5 - Calcule a média dos números maiores que 5:
	//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
	
		 double media = numeros.stream()
			.filter( n -> n>5)
			.mapToDouble(n -> n)
			.average()// tira média como optional, e fica necessário tratar caso o valor fique nulo, se não tratar retorna como optionalDouble
			.orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a média"));
			
			System.out.println(media);
			
			
			
			//.forEach(n -> System.out.println(n));
			//System.out.println(media);
	}

}
