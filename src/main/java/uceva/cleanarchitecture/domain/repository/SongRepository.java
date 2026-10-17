package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Song;

import java.util.List;
import java.util.Optional;

public interface SongRepository {
    List<Song> findAll();

    Optional<Song> findById(Integer id);

    Song save(Song song);

    Optional<Song> update(Integer id, Song song);

    boolean deleteById(Integer id);
}
