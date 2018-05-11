/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW108
 */
public class Compra {

    private int id;
    private double precioTotal;
    private char metododepago;

    public compra() {
    }

    public compra(int id, double precioTotal, char metododepago) {
        this.id = id;
        this.precioTotal = precioTotal;
        this.metododepago = metododepago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public char getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(char metododepago) {
        this.metododepago = metododepago;
    }

}
