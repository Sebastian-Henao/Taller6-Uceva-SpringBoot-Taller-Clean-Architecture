package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Personaje;
import uceva.cleanarchitecture.domain.repository.PersonajeRepository;
import uceva.cleanarchitecture.infrastructure.datasource.PersonajeDatasource;

import java.util.List;

/**
 * Implementa el repositorio de personajes delegando las consultas al datasource.
 */
public class PersonajeRepositoryImpl extends PersonajeRepository {

    private final PersonajeDatasource personajeDatasource;

    /**
     * Crea el repositorio con el datasource que proporciona los personajes.
     *
     * @param personajeDatasource origen de los datos de personajes
     */
    public PersonajeRepositoryImpl(PersonajeDatasource personajeDatasource) {
        this.personajeDatasource = personajeDatasource;
    }

    /**
     * Obtiene personajes mediante el datasource configurado.
     *
     * @param countPersonajes cantidad de personajes que se desea obtener
     * @return lista de personajes generados por el datasource
     */
    @Override
    public List<Personaje> getAll(int countPersonajes) {
        return personajeDatasource.getAll((countPersonajes));
    }
}
