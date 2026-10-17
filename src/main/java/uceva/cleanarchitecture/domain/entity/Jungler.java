package uceva.cleanarchitecture.domain.entity;

/**
 * Entidad que representa un campeón de la jungla de League of Legends.
 *
 * <p>Pertenece a la capa de Dominio y encapsula las propiedades fundamentales
 * de un jungler dentro del juego.</p>
 */
public class Jungler {
    public Integer id;
    public String name;
    public String title;
    public String role;
    public String difficulty;
    public String region;
    public String description;
    public String mainAbilities;

    public Jungler() {
    }

    public Jungler(Integer id, String name, String title, String role, String difficulty, String region, String description, String mainAbilities) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.role = role;
        this.difficulty = difficulty;
        this.region = region;
        this.description = description;
        this.mainAbilities = mainAbilities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainAbilities() {
        return mainAbilities;
    }

    public void setMainAbilities(String mainAbilities) {
        this.mainAbilities = mainAbilities;
    }
}
