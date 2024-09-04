package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
	
	public static void main(String[] args) {
		// Criar uma lista de números inteiros
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		//Usar a function com expressão lambda para dobrar todso os num
		
		//Function<Integer, Integer> dobrar = numero -> numero*2;
		
		List<Integer> numerosDobrados = numeros.stream()
				.map( n -> n*2 )
				.collect(Collectors.toList());
		
		numerosDobrados.forEach(n -> System.out.println(n));
	}

}
