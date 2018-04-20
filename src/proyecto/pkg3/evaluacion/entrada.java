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

    public entrada(int id, double real, boolean VIP) {
        this.id = id;
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

}
