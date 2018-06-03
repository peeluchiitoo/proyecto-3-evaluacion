/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3.evaluacion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro
 */
public class usuarioTest {

    public usuarioTest() {
    }

    /**
     * Test of ValidarNIF method, of class usuario.
     */
    @Test
    public void testValidarNIF() {
        System.out.println("ValidarNIF");
        String NIF = "72157753Z";
        boolean expResult = true;
        boolean result = usuario.ValidarNIF(NIF);
        assertEquals(expResult, result);

    }

    /**
     * Test of ValidarNombre method, of class usuario.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("ValidarNombre");
        String nombre = "pedro";
        usuario instance = new usuario();
        boolean expResult = true;
        boolean result = instance.ValidarNombre(nombre);
        assertEquals(expResult, result);

    }

    /**
     * Test of ValidarApellidos method, of class usuario.
     */
    @Test
    public void testValidarApellidos() {
        System.out.println("ValidarApellidos");
        String apellidos = "delgado";
        usuario instance = new usuario();
        boolean expResult = true;
        boolean result = instance.ValidarApellidos(apellidos);
        assertEquals(expResult, result);

    }

}
