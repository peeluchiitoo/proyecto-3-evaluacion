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
 * @author DAW107, DAW108
 */
public class Concierto {

    // Atributos de la clase conciertos
    int id, hora;
    Calendar fecha;

    // Metodos de la clase conciertos 
    public Concierto(int id, int hora, Calendar fecha) {
        if (id >0) {
          
        } else {
            this.id = id;
        }

        this.hora = hora;
        this.fecha = fecha;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    // To String donde mostramos los datos de la clase concierto
    @Override
    public String toString() {
        return "Concierto{" + "id=" + id + ", hora=" + hora + ", fecha=" + fecha + '}';
    }

    public void VerConciertos(Calendar fecha) {
        Scanner teclado = new Scanner(System.in);
        String c = " ";
        String[] conciertos = {"Arenal sound", "Tomorrowland", "Rebujas", "BBK"};

        System.out.println("Dime el nombre del concierto");
        c = teclado.nextLine();

        switch (c) {
            case "Arenal sound":
                System.out.println("El concierto seleccionado es Arenal sound");
                break;
            case "Tomorrowland":
                System.out.println("El concierto deleccionado es Tomorrowland");
                break;
            case "Rebujas":
                System.out.println("El concierto deleccionado es Rebujas");
                break;
            case "BBK":
                System.out.println("El concierto deleccionado es BBK");
                break;
            default:
                System.out.println("El concierto no existe o no esta disponible");

        }

    }

    public void CrearConcierto(int id, int hora, Calendar fecha) {
        String[] Conciertos;
        Conciertos = new String[1];

    }

}
