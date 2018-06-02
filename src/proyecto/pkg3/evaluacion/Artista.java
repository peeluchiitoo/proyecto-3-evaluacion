package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 * @version 1.0
 */
public class Artista {

    // Atributos de la clase artistas
    int id;
    String nombre;
    char género;

    /**
     * 
     * @param id
     * @param nombre
     * @param género 
     */
    public Artista(int id, String nombre, char género) {
        if (this.id > 0) {
            this.id = id;
        }
        this.nombre = nombre;
        this.género = género;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGénero() {
        return género;
    }

    public void setGénero(char género) {
        this.género = género;
    }

    // To String donde mostramos los datos de la clase artistas
    @Override
    public String toString() {
        return "Artistas{" + "id=" + id + ", nombre=" + nombre + ", g\u00e9nero=" + género + '}';
    }

}
