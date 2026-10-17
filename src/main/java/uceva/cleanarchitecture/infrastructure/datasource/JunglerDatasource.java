package uceva.cleanarchitecture.infrastructure.datasource;

import uceva.cleanarchitecture.domain.entity.Jungler;

import java.util.ArrayList;
import java.util.List;

/**
 * Datasource encargado de suministrar los datos en memoria de los 20 campeones
 * emblemáticos de la jungla de League of Legends.
 */
public class JunglerDatasource {

    private final List<Jungler> junglers = new ArrayList<>();

    public JunglerDatasource() {
        initData();
    }

    private void initData() {
        junglers.add(new Jungler(1, "Lee Sin", "El Monje Ciego", "Luchador", "Alta", "Jonia",
                "Un maestro de las artes marciales de Jonia que canaliza la esencia del dragón para superar cualquier desafío.",
                "Onda Sónica, Salvaguarda, Tempestad, Ira del Dragón"));

        junglers.add(new Jungler(2, "Warwick", "La Furia Desatada de Zaun", "Luchador", "Baja", "Zaun",
                "Un monstruo transformado mediante agonizantes experimentos que caza criminales por los callejones oscuros de Zaun.",
                "Fauce Hambrienta, Cacería Sangrienta, Aullido Primigenio, Opresión Infinita"));

        junglers.add(new Jungler(3, "Vi", "La Defensora de Piltóver", "Luchador", "Media", "Piltover",
                "Una mujer impulsiva y de armas tomar que patrulla las calles de Piltóver con sus masivos guanteletes hextech.",
                "Rompebóvedas, Escudo Pasivo, Golpes Abollantes, Asalto Incansable"));

        junglers.add(new Jungler(4, "Jarvan IV", "El Ejemplo de Demacia", "Tanque", "Media", "Demacia",
                "El heredero al trono de Demacia que lidera a sus ejércitos con valor inquebrantable portando su formidable estandarte.",
                "Golpe del Dragón, Protección Áurea, Estandarte Demaciano, Cataclismo"));

        junglers.add(new Jungler(5, "Sejuani", "La Ira del Invierno", "Tanque", "Media", "Freljord",
                "Feroz comandante de la Garra Invernal que monta a lomos de su drúvask Bristle infundiendo terror gélido.",
                "Asalto Ártico, Ira del Invierno, Congelación, Prisión Glacial"));

        junglers.add(new Jungler(6, "Zac", "El Arma Secreta", "Tanque", "Media", "Zaun",
                "El producto de un experimento zaunita que cobró consciencia y bondad, capaz de estirarse y rebotar dinámicamente.",
                "Golpes Estirados, Materia Inestable, Honda Elástica, ¡Rebotemos!"));

        junglers.add(new Jungler(7, "Amumu", "La Momia Triste", "Tanque", "Baja", "Shurima",
                "Una solitaria alma milenaria de Shurima condenada a vagar por la eternidad en busca de un verdadero amigo.",
                "Lanzamiento de Vendas, Desesperación, Berrinche, Maldición de la Momia Triste"));

        junglers.add(new Jungler(8, "Master Yi", "El Espadachín Wuju", "Asesino", "Baja", "Jonia",
                "El último practicante vivo del arte ancestral Wuju, capaz de diezmar escuadrones a velocidades imperceptibles.",
                "Golpe Alfa, Meditación, Estilo Wuju, Imparable"));

        junglers.add(new Jungler(9, "Kha'Zix", "El Saqueador del Vacío", "Asesino", "Media", "El Vacio",
                "Un despiadado depredador del Vacío que evoluciona constantemente devorando las fortalezas de sus presas.",
                "Saborea su Miedo, Púas del Vacío, Salto, Ataque del Vacío"));

        junglers.add(new Jungler(10, "Evelynn", "El Abrazo de la Agonía", "Asesino", "Media", "Runaterra",
                "Un demonio ancestral que asume forma seductora para atraer a sus víctimas y deleitarse con su sufrimiento.",
                "Púa de Odio, Seducción, Latigazo, Última Caricia"));

        junglers.add(new Jungler(11, "Shaco", "El Bufón Siniestro", "Asesino", "Alta", "Runaterra",
                "Un macabro muñeco encantado que acecha con cajas sorpresa y clones ilusorios asesinando entre risas burlonas.",
                "Engaño, Caja Sorpresa, Veneno de Doble Filo, Alucinación"));

        junglers.add(new Jungler(12, "Kayn", "El Segador Sombrío", "Asesino", "Media", "Jonia",
                "Un prodigio de la magia sombría que libra una batalla interna de voluntades contra el arma oscura Rhaast.",
                "Corte Rápido, Alcance de Cuchilla, Pasaje Sombrío, Transgresión del Umbral"));

        junglers.add(new Jungler(13, "Elise", "La Reina de las Espinas", "Mago", "Alta", "Islas de la Sombra",
                "Una letal sacerdotisa que cambia de forma humana a imponente araña voraz consagrada al Dios Araña.",
                "Neurotoxina, Araña Volátil, Rapel, Forma de Araña"));

        junglers.add(new Jungler(14, "Nidalee", "La Cazadora Salvaje", "Mago", "Alta", "Shurima",
                "Criada en la profundidad de la jungla salvaje, esta cazadora domina la lanza certera y la fiera forma felina.",
                "Jabalina, Emboscada, Tensión Primaria, Aspecto del Felino"));

        junglers.add(new Jungler(15, "Fiddlesticks", "El Terror Ancestral", "Mago", "Media", "Runaterra",
                "La encarnación primigenia del miedo que se alimenta de la desesperación de quienes oyen su macabro graznido.",
                "Terror, Cosecha Abundante, Viento Siniestro, Tormenta de Cuervos"));

        junglers.add(new Jungler(16, "Lillia", "El Brote Tímido", "Mago", "Media", "Jonia",
                "Una cervatilla faérica de Jonia que recolecta los sueños de los mortales para nutrir su árbol materno.",
                "Golpes Florecientes, ¡Cuidado!, Semilla Espiral, Canción de Cuna Rítmica"));

        junglers.add(new Jungler(17, "Graves", "El Forajido", "Tirador", "Media", "Aguas Turbias",
                "Un veterano mercenario armado con una escopeta de doble cañón adaptada para despejar la jungla con potencia implacable.",
                "Fin de la Trayectoria, Pantalla de Humo, Disparo Veloz, Daño Colateral"));

        junglers.add(new Jungler(18, "Kindred", "Los Cazadores Eternos", "Tirador", "Media", "Runaterra",
                "La doble esencia de la muerte: la certera flecha de Oveja para quienes aceptan su destino y los colmillos de Lobo.",
                "Danza de Flechas, Frenesí de Lobo, Terror Creciente, Respiro de Cordera"));

        junglers.add(new Jungler(19, "Hecarim", "La Sombra de la Guerra", "Luchador", "Media", "Islas de la Sombra",
                "Un espectral centauro acorazado que lidera una caballería fantasmal arrasando con devastadora velocidad.",
                "Ataque Furioso, Espíritu de la Devastación, Carga Devastadora, Avalancha de Sombras"));

        junglers.add(new Jungler(20, "Nocturne", "La Pesadilla Eterna", "Asesino", "Baja", "Runaterra",
                "Una amalgama demoníaca extraída de las pesadillas más oscuras que sume al mapa en oscuridad absoluta.",
                "Portador del Anochecer, Velo de la Penumbra, Filo Olvidado, Paranoia"));
    }

    public List<Jungler> getAll(int countJunglers) {
        int limit = Math.min(Math.max(countJunglers, 1), junglers.size());
        return new ArrayList<>(junglers.subList(0, limit));
    }
}
