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
public class Entrada {
    // Atributos de la clase entrada
    private int id;
    private double real;
    private boolean VIP;
    // Metodos de la clase entrada
    public Entrada(int id, double real, boolean VIP) {
        this.id = id;
        this.real = real;
        this.VIP = VIP;
    }
    // Getters and Setters
    public Entrada() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }
    // To String donde mostramos los datos de la clase entrada
    @Override
    public String toString() {
        return "entrada{" + "id=" + id + ", real=" + real + ", VIP=" + VIP + '}';
    }
    

}
