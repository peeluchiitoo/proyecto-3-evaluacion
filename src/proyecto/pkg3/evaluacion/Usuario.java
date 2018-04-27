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
public class Usuario {

    // Atributos de la clase usuario
    private int id;
    private String nombre;
    private String apellidos;
    private String NIF;
    private String email;
    private boolean verificado = false;

    // Metodos de la clase ausuario
    public Usuario() {
    }

    // Getters and Setters
    public Usuario(int id, String nombre, String apellidos, String NIF, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    // To String donde mostramos los datos de la clase usuario
    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", email=" + email + ", verificado=" + verificado + '}';
    }

}
