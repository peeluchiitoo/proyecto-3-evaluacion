package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Informe {

    // Atributos de la clase informe
    int id;
    String Descripción;

    /**
     * 
     * @param id
     * @param Descripción 
     */
    public Informe(int id, String Descripción) {
        if (this.id > 0) {
            this.id = id;
        }
        this.Descripción = Descripción;
    }

    // Getters and Setters
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

    // To String donde mostramos los datos de la clase informe
    @Override
    public String toString() {
        return "Informe{" + "id=" + id + ", Descripci\u00f3n=" + Descripción + '}';
    }

}
