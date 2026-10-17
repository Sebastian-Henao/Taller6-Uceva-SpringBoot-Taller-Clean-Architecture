package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Jungler;
import uceva.cleanarchitecture.domain.repository.JunglerRepository;

import java.util.List;

/**
 * Caso de uso para obtener el listado de campeones junglers.
 *
 * <p>Pertenece a la capa de Aplicación y orquesta la recuperación de junglers
 * dependiendo únicamente de la abstracción {@link JunglerRepository}.</p>
 */
public class GetAllJunglersUseCase {
    private final JunglerRepository junglerRepository;

    public GetAllJunglersUseCase(JunglerRepository junglerRepository) {
        this.junglerRepository = junglerRepository;
    }

    /**
     * Ejecuta el caso de uso para obtener junglers.
     *
     * @param countJunglers Cantidad de campeones a retornar
     * @return Lista de {@link Jungler}
     */
    public List<Jungler> execute(int countJunglers) {
        return junglerRepository.getAll(countJunglers);
    }
}
