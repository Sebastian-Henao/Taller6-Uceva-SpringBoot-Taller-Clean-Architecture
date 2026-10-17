package uceva.cleanarchitecture.infrastructure.datasource;

import uceva.cleanarchitecture.domain.entity.Song;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SongDatasource {
    private final Map<Integer, Song> songs = new LinkedHashMap<>();
    private int nextId = 1;

    public synchronized List<Song> findAll() {
        return new ArrayList<>(songs.values());
    }

    public synchronized Optional<Song> findById(Integer id) {
        return Optional.ofNullable(songs.get(id));
    }

    public synchronized Song save(Song song) {
        Song savedSong = song.withId(nextId++);
        songs.put(savedSong.id(), savedSong);
        return savedSong;
    }

    public synchronized Optional<Song> update(Integer id, Song song) {
        if (!songs.containsKey(id)) {
            return Optional.empty();
        }
        Song updatedSong = song.withId(id);
        songs.put(id, updatedSong);
        return Optional.of(updatedSong);
    }

    public synchronized boolean deleteById(Integer id) {
        return songs.remove(id) != null;
    }
}
