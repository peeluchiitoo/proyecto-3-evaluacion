
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107
 */
public class Artistas {
    int id;
    String nombre;
    char género;

    public Artistas(int id, String nombre, char género) {
        this.id = id;
        this.nombre = nombre;
        this.género = género;
    }

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
    
    
}
