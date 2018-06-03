package proyecto.pkg3.evaluacion;

/**
 *
 * @author DAW107, DAW108
 */
public class Proyecto3Evaluacion {

    public static void main(String[] args) {

        System.out.println("Proyecto de la tercera evaluacion");

        usuario u1 = new usuario(1, "Alvaro", "Diez", "72157753z", "alvaro10g");

        System.out.println(u1.GeneraEmail("alvaro10g"));

    }

}
