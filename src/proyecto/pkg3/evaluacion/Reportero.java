
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Reportero {
    // Atributos de la clase reportero
    String nombre, apellidos, NIF,teléfono;
    // Metodos de la clase reportero
    public Reportero(String nombre, String apellidos, String NIF, String teléfono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.teléfono = teléfono;
    }
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
    // To String donde mostramos los datos de la clase reportero
    @Override
    public String toString() {
        return "Reportero{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", tel\u00e9fono=" + teléfono + '}';
    }
    
    
    
    
}
