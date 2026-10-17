package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Personaje;
import uceva.cleanarchitecture.domain.repository.PersonajeRepository;
import uceva.cleanarchitecture.infrastructure.datasource.PersonajeDatasource;

import java.util.List;

public class PersonajeRepositoryImpl extends PersonajeRepository {

    private final PersonajeDatasource personajeDatasource;

    public PersonajeRepositoryImpl(PersonajeDatasource personajeDatasource) {
        this.personajeDatasource = personajeDatasource;
    }

    @Override
    public List<Personaje> getAll(int countPersonajes) {
        return personajeDatasource.getAll((countPersonajes));
    }
}
