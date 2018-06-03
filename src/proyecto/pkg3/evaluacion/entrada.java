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
public class entrada {

    private int id;
    private double real;
    private boolean VIP;

    /**
     *
     * @param id este campo identifica a cada uno de las actuaciones que forman
     * una gira y no podra ser menor de 0.
     * @param real
     * @param VIP
     */
    public entrada(int id, double real, boolean VIP) {
        if (this.id > 0) {
            this.id = id;
        }
        this.real = real;
        this.VIP = VIP;
    }

    public entrada() {
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

    @Override
    public String toString() {
        return "entrada{" + "id=" + id + ", real=" + real + ", VIP=" + VIP + '}';
    }

    
}
