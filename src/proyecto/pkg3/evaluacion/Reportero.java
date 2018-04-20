
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107
 */
public class Reportero {
    
    String nombre, apellidos, NIF,teléfono;

    public Reportero(String nombre, String apellidos, String NIF, String teléfono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.teléfono = teléfono;
    }

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
    
    
    
}
