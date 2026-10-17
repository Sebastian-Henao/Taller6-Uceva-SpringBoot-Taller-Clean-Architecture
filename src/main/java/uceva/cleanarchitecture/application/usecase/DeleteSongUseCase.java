package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.application.usecase.exception.SongNotFoundException;
import uceva.cleanarchitecture.domain.repository.SongRepository;

public class DeleteSongUseCase {
    private final SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute(Integer id) {
        if (!songRepository.deleteById(id)) {
            throw new SongNotFoundException(id);
        }
    }
}
