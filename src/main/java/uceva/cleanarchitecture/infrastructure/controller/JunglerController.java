package uceva.cleanarchitecture.infrastructure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllJunglersUseCase;
import uceva.cleanarchitecture.domain.entity.Jungler;

import java.util.List;

/**
 * Controlador REST para el módulo de campeones junglers de League of Legends.
 *
 * <p>Expone los endpoints HTTP delegando la lógica al caso de uso correspondiente.</p>
 */
@RestController
@RequestMapping("/junglers")
@Tag(name = "Junglers", description = "Operaciones relacionadas con los campeones de la jungla de League of Legends")
public class JunglerController {

    private final GetAllJunglersUseCase getAllJunglersUseCase;

    public JunglerController(GetAllJunglersUseCase getAllJunglersUseCase) {
        this.getAllJunglersUseCase = getAllJunglersUseCase;
    }

    @Operation(
            summary = "Obtener listado de campeones junglers",
            description = "Retorna una lista de campeones de la jungla de League of Legends según la cantidad solicitada",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Lista de campeones junglers generada exitosamente",
                            content = @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = Jungler.class))
                            )
                    )
            }
    )
    @GetMapping("/{countJunglers}")
    public List<Jungler> getAll(
            @Parameter(description = "Cantidad de campeones junglers a retornar", example = "20")
            @PathVariable int countJunglers) {
        return getAllJunglersUseCase.execute(countJunglers);
    }
}
