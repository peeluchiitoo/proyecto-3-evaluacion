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
public class ReporteroTest {

    public ReporteroTest() {
    }

    /**
     * Test of ValidarNombre method, of class Reportero.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("ValidarNombre");
        String nombre = "alvaro";
        Reportero instance = new Reportero("alvaro", "diez", "72157753z", "7879451202");
        boolean expResult = true;
        boolean result = instance.ValidarNombre(nombre);
        assertEquals(expResult, result);
    }

    /**
     * Test of ValidarApellidos method, of class Reportero.
     */
    @Test
    public void testValidarApellidos() {
        System.out.println("ValidarApellidos");
        String apellidos = "diez";
        Reportero instance = new Reportero("alvaro", "diez", "72157753z", "7879451202");
        boolean expResult = true;
        boolean result = instance.ValidarApellidos(apellidos);
        assertEquals(expResult, result);
    }

    /**
     * Test of ValidarNIF method, of class Reportero.
     */
    @Test
    public void testValidarNIF() {
        System.out.println("ValidarNIF");
        String NIF = "72157753z";
        boolean expResult = true;
        boolean result = Reportero.ValidarNIF(NIF);
        assertEquals(expResult, result);
    }

    /**
     * Test of ValidarTelefono method, of class Reportero.
     */
    @Test
    public void testValidarTelefono() {
        System.out.println("ValidarTelefono");
        String teléfono = "789451202";
        Reportero instance = new Reportero("alvaro", "diez", "72157753z", "7879451202");
        boolean expResult = true;
        boolean result = instance.ValidarTelefono(teléfono);
        assertEquals(expResult, result);
    }

}
