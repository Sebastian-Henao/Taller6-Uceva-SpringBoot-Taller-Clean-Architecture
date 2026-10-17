package uceva.cleanarchitecture.domain.entity;

public record Song(
        Integer id,
        String title,
        Integer durationSeconds,
        String genre,
        Integer artistId,
        Integer albumId
) {
    public Song {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("El título de la canción es obligatorio");
        }
        if (durationSeconds == null || durationSeconds <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor que cero");
        }
        if (genre == null || genre.isBlank()) {
            throw new IllegalArgumentException("El género musical es obligatorio");
        }
        if (artistId == null || artistId <= 0) {
            throw new IllegalArgumentException("El ID del artista debe ser mayor que cero");
        }
        if (albumId == null || albumId <= 0) {
            throw new IllegalArgumentException("El ID del álbum debe ser mayor que cero");
        }
    }

    public Song withId(Integer newId) {
        return new Song(newId, title, durationSeconds, genre, artistId, albumId);
    }
}
