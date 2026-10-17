package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Song;
import uceva.cleanarchitecture.domain.repository.SongRepository;

public class CreateSongUseCase {
    private final SongRepository songRepository;

    public CreateSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song execute(Song song) {
        return songRepository.save(song);
    }
}
