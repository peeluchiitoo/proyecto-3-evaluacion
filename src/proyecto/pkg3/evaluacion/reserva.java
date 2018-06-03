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
public class reserva {

    private int id;
    private Calendar fechamax;
    private Calendar fechacanje;

    public reserva() {
    }

    /**
     *
     * @param id este campo identifica a cada uno de las reservas que forman
     * una gira y no podra ser menor de 0.
     * @param fechamax
     * @param fechacanje
     */
    public reserva(int id, Calendar fechamax, Calendar fechacanje) {
        if (this.id > 0) {
            this.id = id;
        } else {
            System.out.println("ID invalido");
        }
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

    @Override
    public String toString() {
        return "reserva{" + "id=" + id + ", fechamax=" + fechamax + ", fechacanje=" + fechacanje + '}';
    }

}
