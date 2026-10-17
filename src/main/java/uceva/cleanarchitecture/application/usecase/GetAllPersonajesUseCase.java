package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Personaje;
import uceva.cleanarchitecture.domain.repository.PersonajeRepository;

import java.util.List;

/**
 * Caso de uso para recuperar personajes desde el repositorio.
 */
public class GetAllPersonajesUseCase {
    private final PersonajeRepository personajeRepository;

    /**
     * Crea el caso de uso con el repositorio de personajes requerido.
     *
     * @param personajeRepository repositorio utilizado para obtener personajes
     */
    public  GetAllPersonajesUseCase(PersonajeRepository personajeRepository){
        this.personajeRepository = personajeRepository;
    }

    /**
     * Recupera la cantidad solicitada de personajes.
     *
     * @param countPersonajes cantidad de personajes que se desea obtener
     * @return lista de personajes recuperados
     */
    public List<Personaje> execute(int countPersonajes){
        return personajeRepository.getAll(countPersonajes);
    }
}
