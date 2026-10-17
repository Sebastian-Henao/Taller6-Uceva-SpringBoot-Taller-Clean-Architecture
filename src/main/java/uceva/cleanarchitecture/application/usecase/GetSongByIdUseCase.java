package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.application.usecase.exception.SongNotFoundException;
import uceva.cleanarchitecture.domain.entity.Song;
import uceva.cleanarchitecture.domain.repository.SongRepository;

public class GetSongByIdUseCase {
    private final SongRepository songRepository;

    public GetSongByIdUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song execute(Integer id) {
        return songRepository.findById(id)
                .orElseThrow(() -> new SongNotFoundException(id));
    }
}
