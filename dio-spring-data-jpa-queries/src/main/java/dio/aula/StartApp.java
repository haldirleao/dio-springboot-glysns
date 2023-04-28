package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // List<User> users = repository.filtrarPorNome("GLEYSON");
        List<User> users = repository.findByNameContaining("GLEYSON");
        
        System.out.println("-----------");
        for (User u : users) {
            System.out.println(u);
        }
        System.out.println("-----------");
    }

    private void insertUser() {
        User user = new User();
        user.setName("GLEYSON");
        user.setUsername("glysns");
        user.setPassword("dio123");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}