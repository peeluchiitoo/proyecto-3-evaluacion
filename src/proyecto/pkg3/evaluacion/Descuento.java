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
public class Descuento {
    // Atributos de la clase descuento
    private int id;
    private double cantidad;
    private Calendar fechavalidez;
    // Metodos de la clase descuento
    public Descuento() {
    }
    // Getters and Setters
    public Descuento(int id, double cantidad, Calendar fechavalidez) {
        this.id = id;
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
    // To String donde mostramos los datos de la clase descuento
    @Override
    public String toString() {
        return "descuento{" + "id=" + id + ", cantidad=" + cantidad + ", fechavalidez=" + fechavalidez + '}';
    }
    

}
