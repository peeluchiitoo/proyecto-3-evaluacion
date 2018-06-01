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
public class Descuento {

    private int id;
    private double cantidad;
    private Calendar fechavalidez;

    public Descuento() {
    }
    /**
     * 
     * @param id
     * @param cantidad
     * @param fechavalidez 
     */
    public Descuento(int id, double cantidad, Calendar fechavalidez) {
        if (this.id > 0) {
            this.id = id;
        }
        this.cantidad = cantidad;
        this.fechavalidez = fechavalidez;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Calendar getFechavalidez() {
        return fechavalidez;
    }

    public void setFechavalidez(Calendar fechavalidez) {
        this.fechavalidez = fechavalidez;
    }

}
