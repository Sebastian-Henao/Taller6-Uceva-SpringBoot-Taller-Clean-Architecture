package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllPersonajesUseCase;
import uceva.cleanarchitecture.domain.entity.Personaje;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    private final GetAllPersonajesUseCase getAllPersonajesUseCase;

    public PersonajeController(GetAllPersonajesUseCase getAllPersonajesUseCase){
        this.getAllPersonajesUseCase = getAllPersonajesUseCase;
    }

    @GetMapping("/{countPersonajes}")
    public List<Personaje> getAll(@PathVariable int countPersonajes) {
        return  getAllPersonajesUseCase.execute(countPersonajes);
    }
}
