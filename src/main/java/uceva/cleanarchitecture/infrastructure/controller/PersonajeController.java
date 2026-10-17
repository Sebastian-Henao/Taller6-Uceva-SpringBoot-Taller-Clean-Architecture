package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllPersonajesUseCase;
import uceva.cleanarchitecture.domain.entity.Personaje;

import java.util.List;

/**
 * Expone los endpoints HTTP para consultar personajes.
 */
@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    private final GetAllPersonajesUseCase getAllPersonajesUseCase;

    /**
     * Crea el controlador con el caso de uso para consultar personajes.
     *
     * @param getAllPersonajesUseCase caso de uso que obtiene los personajes
     */
    public PersonajeController(GetAllPersonajesUseCase getAllPersonajesUseCase){
        this.getAllPersonajesUseCase = getAllPersonajesUseCase;
    }

    /**
     * Devuelve la cantidad de personajes indicada en la ruta.
     *
     * @param countPersonajes cantidad de personajes que se desea obtener
     * @return lista de personajes
     */
    @GetMapping("/{countPersonajes}")
    public List<Personaje> getAll(@PathVariable int countPersonajes) {
        return  getAllPersonajesUseCase.execute(countPersonajes);
    }
}
