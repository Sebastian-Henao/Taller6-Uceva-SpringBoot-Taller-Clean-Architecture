package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.application.usecase.exception.SongNotFoundException;
import uceva.cleanarchitecture.domain.entity.Song;
import uceva.cleanarchitecture.domain.repository.SongRepository;

public class UpdateSongUseCase {
    private final SongRepository songRepository;

    public UpdateSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song execute(Integer id, Song song) {
        return songRepository.update(id, song)
                .orElseThrow(() -> new SongNotFoundException(id));
    }
}
