package uceva.cleanarchitecture.infrastructure.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.CreateSongUseCase;
import uceva.cleanarchitecture.application.usecase.DeleteSongUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllSongsUseCase;
import uceva.cleanarchitecture.application.usecase.GetSongByIdUseCase;
import uceva.cleanarchitecture.application.usecase.UpdateSongUseCase;
import uceva.cleanarchitecture.domain.entity.Song;

import java.util.List;

@RestController
@RequestMapping("/songs")
@Tag(name = "Canciones", description = "Administración del catálogo de canciones")
public class SongController {
    private final GetAllSongsUseCase getAllSongsUseCase;
    private final GetSongByIdUseCase getSongByIdUseCase;
    private final CreateSongUseCase createSongUseCase;
    private final UpdateSongUseCase updateSongUseCase;
    private final DeleteSongUseCase deleteSongUseCase;

    public SongController(
            GetAllSongsUseCase getAllSongsUseCase,
            GetSongByIdUseCase getSongByIdUseCase,
            CreateSongUseCase createSongUseCase,
            UpdateSongUseCase updateSongUseCase,
            DeleteSongUseCase deleteSongUseCase
    ) {
        this.getAllSongsUseCase = getAllSongsUseCase;
        this.getSongByIdUseCase = getSongByIdUseCase;
        this.createSongUseCase = createSongUseCase;
        this.updateSongUseCase = updateSongUseCase;
        this.deleteSongUseCase = deleteSongUseCase;
    }

    @GetMapping
    @Operation(summary = "Listar canciones")
    @ApiResponse(responseCode = "200", description = "Canciones consultadas correctamente")
    public List<Song> getAll() {
        return getAllSongsUseCase.execute();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Consultar una canción por ID")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Canción encontrada"),
            @ApiResponse(responseCode = "404", description = "Canción no encontrada")
    })
    public Song getById(@PathVariable Integer id) {
        return getSongByIdUseCase.execute(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Crear una canción")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Canción creada"),
            @ApiResponse(responseCode = "400", description = "Datos de canción inválidos")
    })
    public Song create(@RequestBody Song song) {
        return createSongUseCase.execute(song);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar una canción")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Canción actualizada"),
            @ApiResponse(responseCode = "400", description = "Datos de canción inválidos"),
            @ApiResponse(responseCode = "404", description = "Canción no encontrada")
    })
    public Song update(@PathVariable Integer id, @RequestBody Song song) {
        return updateSongUseCase.execute(id, song);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar una canción")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Canción eliminada"),
            @ApiResponse(responseCode = "404", description = "Canción no encontrada")
    })
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        deleteSongUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }
}
