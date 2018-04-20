
package proyecto.pkg3.evaluacion;

import java.util.Calendar;

/**
 *
 * @author DAW107
 */
public class Gira {
    String nombre;
    Calendar fechaApertura,fechaCierre;

    public Gira(String nombre, Calendar fechaApertura, Calendar fechaCierre) {
        this.nombre = nombre;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Calendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Calendar getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Calendar fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
    
    
    
}
