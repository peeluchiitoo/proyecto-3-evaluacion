package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Reportero {

    // Atributos de la clase reportero
    private String nombre, apellidos, NIF, teléfono;

    /**
     * constructor donde se validan mediante una serie de metodos todos los
     * parametros.
     *
     * @param nombre Este parámetro indica el nombre del reportero
     * @param apellidos Este parámetro indica el apellido del reportero
     * @param NIF
     * @param teléfono
     */
    public Reportero(String nombre, String apellidos, String NIF, String teléfono) {

        if (ValidarNombre(nombre) == true) {
            this.nombre = nombre;
        }
        if (ValidarApellidos(apellidos) == true) {
            this.apellidos = apellidos;
        }
        if (ValidarNIF(NIF) == true) {
            this.NIF = NIF;
        }
        if (ValidarTelefono(teléfono) == true) {
            this.teléfono = teléfono;
        }

    }

    // Getters and Setters
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

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    // To String donde mostramos los datos de la clase reportero
    @Override
    public String toString() {
        return "Reportero{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", tel\u00e9fono=" + teléfono + '}';
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
     * En este metodo controlamos que al meter un numero de telefono solo nos
     * deje meter numero. por lo cual solo saldria true de ser numero(false de
     * contener algun caracter que no lo fuese).
     *
     * @param teléfono Introducimos el numero por parametro
     * @return nos devuelve true si es valido y false si no lo es.
     */
    public boolean ValidarTelefono(String teléfono) {
        boolean EsValido = true;
        boolean N = teléfono.matches("([0 - 9])");
        if (this.teléfono.length() == 9) {
            if (N == true) {
                return EsValido;
            } else {
                return EsValido = false;
            }
        }
        return EsValido;

    }

}
