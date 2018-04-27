/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

import java.util.Calendar;

/**
 *
 * @author DAW107, DAW108
 */
public class Concierto {
    // Atributos de la clase conciertos
    int id, hora;
    Calendar fecha;
    // Metodos de la clase conciertos 
    public Concierto(int id, int hora, Calendar fecha) {
        this.id = id;
        this.hora = hora;
        this.fecha = fecha;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    // To String donde mostramos los datos de la clase concierto
    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", hora=" + hora + ", fecha=" + fecha + '}';
    }
    
    
}
