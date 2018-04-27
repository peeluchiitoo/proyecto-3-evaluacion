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
public class Reserva {
    // Atributos de la clase reserva
    private int id;
    private Calendar fechamax;
    private Calendar fechacanje;
    // Metodos de la clase reserva
    public Reserva() {
    }
    // Getters and Setters
    public Reserva(int id, Calendar fechamax, Calendar fechacanje) {
        this.id = id;
        this.fechamax = fechamax;
        this.fechacanje = fechacanje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getFechamax() {
        return fechamax;
    }

    public void setFechamax(Calendar fechamax) {
        this.fechamax = fechamax;
    }

    public Calendar getFechacanje() {
        return fechacanje;
    }

    public void setFechacanje(Calendar fechacanje) {
        this.fechacanje = fechacanje;
    }
    // To String donde mostramos los datos de la clase reserva
    @Override
    public String toString() {
        return "reserva{" + "id=" + id + ", fechamax=" + fechamax + ", fechacanje=" + fechacanje + '}';
    }
    

}
