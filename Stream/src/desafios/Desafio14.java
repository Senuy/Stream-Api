package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio14 {
	
	// Encontre o maior número primo da lista:
	//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,13,47,967);
		
		Integer maiorPrimo = numeros.stream()
			.filter(n -> n>1)
			.filter(n -> {
				for(int i = 2 ; i <= Math.sqrt(n);i++) {
					if(n %i ==0) {
						return false;
					}
				}
				return true;
			})
			.max(Comparator.naturalOrder())
			.orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar o primo"));
		
		System.out.println(maiorPrimo);
		
		
	}

}
