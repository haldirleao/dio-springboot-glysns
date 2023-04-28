package dio.springbootprimeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPrimeirosPassosApplication {

	public static void main(String[] args) {
		
		// inicializa container Spring Boot
		SpringApplication.run(SpringbootPrimeirosPassosApplication.class, args);

		// O código abaixo funciona, porém está conceitualmente errado ao trabalhar com
		// Spring Boot. Não instanciamos com "new" ao usar o Spring Boot.
		// ou seja: !!! JAMAIS USAR "nem" !!!
		// Calculadora myCalculadora = new Calculadora();
		// System.out.println(myCalculadora.somar(2, 2));

	}

}
