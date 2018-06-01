/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

import java.util.Calendar;

/**
 *
 * @author DAW108
 */
public class Excepciones extends Concierto {

    public Excepciones(int id, int hora, Calendar fecha) {
        super(id, hora, fecha);
    }

    public Boolean conciertos() {
        boolean valido = false;
        if (this.id <= 0) {
            return valido;
        } else {
            return valido = true;
        }

    }

}
