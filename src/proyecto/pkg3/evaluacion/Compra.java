/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Compra {
    // Atributos de la clase Compra
    private int id;
    private double precioTotal;
    private char metododepago;
    // Metodos de la clase Compra
    public Compra() {
    }
    // Getters and Setters
    public Compra(int id, double precioTotal, char metododepago) {
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
    // To String donde mostramos los datos de la clase Compra
    @Override
    public String toString() {
        return "compra{" + "id=" + id + ", precioTotal=" + precioTotal + ", metododepago=" + metododepago + '}';
    }
    

}
