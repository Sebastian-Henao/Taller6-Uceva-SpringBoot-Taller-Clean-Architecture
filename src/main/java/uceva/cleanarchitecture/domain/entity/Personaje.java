package uceva.cleanarchitecture.domain.entity;

/**
 * Representa un personaje disponible en el catálogo de la aplicación.
 */
public class Personaje {
    /** Identificador único del personaje. */
    public Integer id;

    /** Nombre del personaje. */
    public String nombre;

    /** Alias con el que se conoce al personaje. */
    public String alias;

    /** Juego al que pertenece el personaje. */
    public String juego;

    /** Habilidad principal del personaje. */
    public String habilidad;

    /** Rol que desempeña el personaje. */
    public String rol;

    /**
     * Crea un personaje con sus datos principales.
     *
     * @param id identificador del personaje
     * @param nombre nombre del personaje
     * @param alias alias del personaje
     * @param juego juego al que pertenece
     * @param habilidad habilidad principal
     * @param rol rol que desempeña
     */
    public Personaje(Integer id, String nombre, String alias, String juego, String habilidad, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.juego = juego;
        this.habilidad = habilidad;
        this.rol = rol;
    }
}
