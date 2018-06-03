package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Reportero {

    // Atributos de la clase reportero

    String nombre, apellidos, NIF, teléfono;

    /**
     *
     * @param nombre
     * @param apellidos
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

    public boolean ValidarNombre(String nombre) {
        boolean EsValido = true;
        boolean N = nombre.matches("([a-z]|[A-Z]|\\s)+");

        if (N == true) {
            return EsValido;
        } else {
            return EsValido = false;
        }
    }

    public boolean ValidarApellidos(String apellidos) {
        boolean EsValido = true;
        boolean N = apellidos.matches("([a-z]|[A-Z]|\\s)+");

        if (N == true) {
            return EsValido;
        } else {
            return EsValido = false;
        }
    }

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
