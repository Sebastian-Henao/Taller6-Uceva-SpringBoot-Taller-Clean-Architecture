package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonajeDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();
    private final String[] roles = {
            "Vanguardia",
            "Ladron",
            "Jefe",
            "Ilusionista",
            "Explorador",
    };

    public List<Personaje> getAll(int countPersonajes) {
        List<Personaje> personajes = new ArrayList<Personaje>();
        for (int i = 1; i <= countPersonajes; i++) {
            personajes.add(generarPersonaje(i));
        }
        return personajes;
    }

    private Personaje generarPersonaje(Integer id){
        return new Personaje(
                id,
                faker.name().fullName(),
                faker.lorem().word(),
                faker.company().name(),
                faker.commerce().productName(),
                randomRol()
        );
    }

    private String randomRol() {
        return roles[random.nextInt(roles.length)];
    }
}
