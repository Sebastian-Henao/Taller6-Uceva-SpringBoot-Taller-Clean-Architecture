package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Song;
import uceva.cleanarchitecture.domain.repository.SongRepository;
import uceva.cleanarchitecture.infrastructure.datasource.SongDatasource;

import java.util.List;
import java.util.Optional;

public class SongRepositoryImpl implements SongRepository {
    private final SongDatasource songDatasource;

    public SongRepositoryImpl(SongDatasource songDatasource) {
        this.songDatasource = songDatasource;
    }

    @Override
    public List<Song> findAll() {
        return songDatasource.findAll();
    }

    @Override
    public Optional<Song> findById(Integer id) {
        return songDatasource.findById(id);
    }

    @Override
    public Song save(Song song) {
        return songDatasource.save(song);
    }

    @Override
    public Optional<Song> update(Integer id, Song song) {
        return songDatasource.update(id, song);
    }

    @Override
    public boolean deleteById(Integer id) {
        return songDatasource.deleteById(id);
    }
}
