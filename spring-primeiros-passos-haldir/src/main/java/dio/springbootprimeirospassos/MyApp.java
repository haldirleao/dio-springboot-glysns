package dio.springbootprimeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        int num1 = 2;
        int num2 = 2;
        System.out.println(num1 + " + " + num2 + " = " + calculadora.somar(2, 2));
        System.out.println("Beans 'calculadora' funcionou!!!");
        
    }

}
