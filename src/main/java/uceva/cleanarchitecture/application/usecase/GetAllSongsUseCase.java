package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Song;
import uceva.cleanarchitecture.domain.repository.SongRepository;

import java.util.List;

public class GetAllSongsUseCase {
    private final SongRepository songRepository;

    public GetAllSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> execute() {
        return songRepository.findAll();
    }
}
