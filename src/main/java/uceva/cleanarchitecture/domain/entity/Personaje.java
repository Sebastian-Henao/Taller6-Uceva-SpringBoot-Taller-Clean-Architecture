package uceva.cleanarchitecture.domain.entity;

public class Personaje {
    public Integer id;
    public String nombre;
    public String alias;
    public String juego;
    public String habilidad;
    public String rol;

    public Personaje(Integer id, String nombre, String alias, String juego, String habilidad, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.juego = juego;
        this.habilidad = habilidad;
        this.rol = rol;
    }
}
