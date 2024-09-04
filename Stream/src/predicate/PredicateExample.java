package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
		
		List<String> palavras = Arrays.asList("Java","Python","JavaScritpt","C++","C","Kotlin");
		
		// criar um preciad que verifica se a palavra tem mais de 6 caracteres
		
		//Predicate<String> maisdeCincoCarac = palavra -> palavra.length()>5;
		
		palavras.stream()
			.filter(p -> p.length()>5)
			.forEach(p -> System.out.println(p));
		
		
	}

}
