package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Jungler;
import uceva.cleanarchitecture.domain.repository.JunglerRepository;
import uceva.cleanarchitecture.infrastructure.datasource.JunglerDatasource;

import java.util.List;

/**
 * Implementación concreta del repositorio de junglers.
 *
 * <p>Actúa como adaptador entre el contrato {@link JunglerRepository} del Dominio
 * y la fuente de datos {@link JunglerDatasource} de Infraestructura.</p>
 */
public class JunglerRepositoryImpl extends JunglerRepository {

    private final JunglerDatasource junglerDatasource;

    public JunglerRepositoryImpl(JunglerDatasource junglerDatasource) {
        this.junglerDatasource = junglerDatasource;
    }

    @Override
    public List<Jungler> getAll(int countJunglers) {
        return junglerDatasource.getAll(countJunglers);
    }
}
