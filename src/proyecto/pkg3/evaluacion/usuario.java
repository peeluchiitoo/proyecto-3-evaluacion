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
public class usuario {

    private int id;
    private String nombre;
    private String apellidos;
    private String NIF;
    private String email; // @javamail.com sera el dominio por defecto de los emails que crearemos
    private boolean verificado = false;

    public usuario() {
    }

    /**
     *
     * @param id Este campo identifica a cada uno de las actuaciones que forman
     * una gira y no podra ser menor de 0.
     * @param nombre
     * @param apellidos
     * @param NIF este campo comprende un String con 8 numeros y
     * @param email
     */
    public usuario(int id, String nombre, String apellidos, String NIF, String email) {
        if (this.id > 0) {
            this.id = id;
        }
        if (ValidarNombre(nombre) == true) {
            this.nombre = nombre;
        }
        if (ValidarApellidos(apellidos) == true) {
            this.apellidos = apellidos;
        }
        if (ValidarNIF(NIF) == true) {
            this.NIF = NIF;
        }
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

    public String GeneraEmail(String email) {
        return (this.email + "@javamail.com").toLowerCase();
    }

    /**
     * Este metodo nos devuelve si el DNI introducido es correcto o no
     *
     * @param NIF Variable que pasamos por teclado
     * @return nos devolvera true o false dependiendo de si el dni es verdadero
     * o falso
     */
    public static boolean ValidarNIF(String NIF) {

        boolean esValido = false;
        int i = 0;
        int caracterASCII = 0;
        char letra = ' ';
        int miNIF = 0;
        int resto = 0;
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (NIF.length() == 9 && Character.isLetter(NIF.charAt(8))) {
            do {
                caracterASCII = NIF.codePointAt(i);
                esValido = (caracterASCII > 47 && caracterASCII < 58);
                i++;
            } while (i < NIF.length() - 1 && esValido);

        }

        if (esValido) {
            letra = Character.toUpperCase(NIF.charAt(8));
            miNIF = Integer.parseInt(NIF.substring(0, 8));
            resto = miNIF % 23;
            esValido = (letra == asignacionLetra[resto]);
        }
        return esValido;

    }

    /**
     * Este metodo nos devuelve verdadero o falso dependiendo de si es correcto
     * el nombre introducido(que no contenga mas que letras , tanto mayusculas
     * como minusculas) 
     * 
     * @param nombre Variable metida por paramtero
     * @return nos devuelve true o false dependiendo de si el String del nombre
     * o de los apellidos son correctos o no
     */
    public boolean ValidarNombre(String nombre) {
        boolean EsValido = true;
        boolean N = nombre.matches("([a-z]|[A-Z]|\\s)+");

        if (N == true) {
            return EsValido;
        } else {
            return EsValido = false;
        }
    }

    /**
     * valida si el apellido del usuario que estamos metiendo es correcto, esto
     * quiere decir que no contenga mas que letras, tanto mayusculas como
     * minusculas
     *
     * @param apellidos Variable metida por paramtero
     * @return nos devuelve true o false dependiendo de si el String del nombre
     * o de los apellidos son correctos o no
     */
    public boolean ValidarApellidos(String apellidos) {
        boolean EsValido = true;
        boolean N = apellidos.matches("([a-z]|[A-Z]|\\s)+");

        if (N == true) {
            return EsValido;
        } else {
            return EsValido = false;
        }
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", email=" + email + '}';
    }

}
