/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DAW108
 */
public class Compra {

    private int id;
    private double precioTotal;
    private char metododepago;

    public Compra() {
    }
    /**
     * 
     * @param id id este campo identifica a cada uno de las actuaciones que forman
     * una gira y no podra ser menor de 0.
     * @param precioTotal
     * @param metododepago 
     */
    public Compra(int id, double precioTotal, char metododepago) {
        if (this.id > 0) {
            this.id = id;
        }
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

    public void ComprarEntrada(Calendar fecha) {

    }
    
    public void MetodoPago(Calendar fecha) {
        Scanner teclado = new Scanner(System.in);
        String c = " ";
        String[] conciertos = {"tranferencia", "Cheque", "tarjeta", "contra Rembolso"};

        System.out.println("Dime el nombre del concierto");
        c = teclado.nextLine();

        switch (c) {
            case "tranferencia":
                System.out.println("El metodo de pago seleccionado es tranferencia");
                break;
            case "Cheque":
                System.out.println("El metodo de pago seleccionado es cheque");
                break;
            case "tarjeta":
                System.out.println("El metodo de pago seleccionado es tarjeta");
                break;
            case "contra Rembolso":
                System.out.println("El metodo de pago seleccionado es contra Rembolso");
                break;
            case "bit coins":
                System.out.println("El metodo de pago seleccionado es contra bit coins");
                break;
            default:
                System.out.println("no existe ese tipo de metodo de pago");

        }

    }

}
