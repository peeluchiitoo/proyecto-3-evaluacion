package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 * @version 1.0
 */
public class Actuación {

    // Atributos de la clase actuacion
    int id, NumeroSecuencia, duración;

    // Metodos de la clase actuacion 
    public Actuación(int id, int NumeroSecuencia, int duración) {
        this.id = id;
        this.NumeroSecuencia = NumeroSecuencia;
        this.duración = duración;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSecuencia() {
        return NumeroSecuencia;
    }

    public void setNumeroSecuencia(int NumeroSecuencia) {
        this.NumeroSecuencia = NumeroSecuencia;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    // To String donde mostramos los datos de la clase actuaciones
    @Override
    public String toString() {
        return "Actuaci\u00f3n{" + "id=" + id + ", NumeroSecuencia=" + NumeroSecuencia + ", duraci\u00f3n=" + duración + '}';
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean consultarActuacion(int id){
        return true;
    }

}
