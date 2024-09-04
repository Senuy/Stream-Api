package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		//Supplier<String> saudacao = () -> "Olá,  Seja bem-vindo!";
		
		List<String> listaSaudacoes = Stream.generate(() -> "Olá, Seja bem vindo"
		)
				.limit(5)
				.collect(Collectors.toList());
		
		listaSaudacoes.forEach(s -> System.out.println(s));
	}

}
