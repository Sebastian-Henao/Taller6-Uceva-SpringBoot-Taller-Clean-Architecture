package uceva.cleanarchitecture.application.usecase.exception;

public class SongNotFoundException extends RuntimeException {
    public SongNotFoundException(Integer id) {
        super("No se encontró una canción con el ID " + id);
    }
}
