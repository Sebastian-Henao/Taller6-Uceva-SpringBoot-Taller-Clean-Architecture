package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Personaje;

import java.util.List;

/**
 * Define las operaciones de acceso al repositorio de personajes.
 */
public abstract class PersonajeRepository {

    /**
     * Obtiene una cantidad determinada de personajes.
     *
     * @param countPersonajes cantidad de personajes solicitada
     * @return lista de personajes
     */
    public abstract List<Personaje> getAll(int countPersonajes);
}
