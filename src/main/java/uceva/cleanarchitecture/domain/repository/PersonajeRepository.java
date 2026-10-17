package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Personaje;

import java.util.List;

public abstract class PersonajeRepository {
    public abstract List<Personaje> getAll(int countPersonajes);
}
