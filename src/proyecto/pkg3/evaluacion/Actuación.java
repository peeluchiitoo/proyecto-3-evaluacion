
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107
 */
public class Actuación {
    
    int id,NumeroSecuencia,duración;

    public Actuación(int id, int NumeroSecuencia, int duración) {
        this.id = id;
        this.NumeroSecuencia = NumeroSecuencia;
        this.duración = duración;
    }

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
    
    
    
    
}
