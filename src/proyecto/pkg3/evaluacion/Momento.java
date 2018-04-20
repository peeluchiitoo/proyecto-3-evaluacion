
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107
 */
public class Momento {
    
    int id,hora;
    String descripción;

    public Momento(int id, int hora, String descripción) {
        this.id = id;
        this.hora = hora;
        this.descripción = descripción;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    
    
}
