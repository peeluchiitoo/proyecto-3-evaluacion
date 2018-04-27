
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Momento {
    // Atributos de la clase momento
    int id,hora;
    String descripción;
    // Metodos de la clase momento
    public Momento(int id, int hora, String descripción) {
        this.id = id;
        this.hora = hora;
        this.descripción = descripción;
    }
    // Getters and Setters
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
    // To String donde mostramos los datos de la clase momento
    @Override
    public String toString() {
        return "Momento{" + "id=" + id + ", hora=" + hora + ", descripci\u00f3n=" + descripción + '}';
    }
    
    
    
    
}
