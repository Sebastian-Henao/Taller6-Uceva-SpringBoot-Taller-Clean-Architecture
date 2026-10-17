package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Personaje;
import uceva.cleanarchitecture.domain.repository.PersonajeRepository;

import java.util.List;

public class GetAllPersonajesUseCase {
    private final PersonajeRepository personajeRepository;

    public  GetAllPersonajesUseCase(PersonajeRepository personajeRepository){
        this.personajeRepository = personajeRepository;
    }

    public List<Personaje> execute(int countPersonajes){
        return personajeRepository.getAll(countPersonajes);
    }
}
