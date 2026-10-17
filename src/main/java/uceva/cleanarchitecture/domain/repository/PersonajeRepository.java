package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Product;

import java.util.List;

public abstract class PersonajeRepository {
    public abstract List<Product> getAll(int countProducts);
}
