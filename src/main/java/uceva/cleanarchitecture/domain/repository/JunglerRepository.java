package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Jungler;

import java.util.List;

/**
 * Contrato del repositorio para la obtención de campeones junglers.
 *
 * <p>Define el contrato abstracto de persistencia/recuperación en la capa de Dominio,
 * independiente de cualquier framework o tecnología de infraestructura.</p>
 */
public abstract class JunglerRepository {
    /**
     * Obtiene el listado de campeones junglers.
     *
     * @param countJunglers Cantidad máxima de campeones a retornar
     * @return Lista de campeones {@link Jungler}
     */
    public abstract List<Jungler> getAll(int countJunglers);
}
