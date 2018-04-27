
package proyecto.pkg3.evaluacion;

import java.util.Calendar;

/**
 *
 * @author DAW107, DAW108
 */
public class Gira {
    // Atributos de la clase gira
    String nombre;
    Calendar fechaApertura,fechaCierre;
    // Metodos de la clase gira 
    public Gira(String nombre, Calendar fechaApertura, Calendar fechaCierre) {
        this.nombre = nombre;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }
    // Getters and Setters
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
    // To String donde mostramos los datos de la gira
    @Override
    public String toString() {
        return "Gira{" + "nombre=" + nombre + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + '}';
    }
    
    /**
     * Devuelve si hay o no hay conciertos para la gira cuyo identificador se pasa como primer parámetro, en el rango de fechas especificadas por el segundo y el tercer parámetro
     * @param idGira el identificador de la gira a consultar
     * @param fechaIni fecha de inicio de la consulta
     * @param fechaFin fecha de fin de la consulta
     * @return 
     */
    public boolean consultarGira(int idGira, Calendar fechaIni, Calendar fechaFin){
        return true;
    }
    
    
    
    
}
