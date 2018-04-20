
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107
 */
public class Informe {
    
    int id;
    String Descripción;

    public Informe(int id, String Descripción) {
        this.id = id;
        this.Descripción = Descripción;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }
    
    
}
