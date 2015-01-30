/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.calculator.test;

import co.edu.bosque.swii.calculator.calculator.Calculador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class CalculadorTest {
    
    public CalculadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculador.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double numero1 = 1.0;
        double numero2 = 5.0;
         Calculador instance = new Calculador();
        double expResult = 6.0;
        double result = instance.sumar(numero1, numero2);
        System.out.println(result);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculador.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double numero1 = 6.0;
        double numero2 = 4.0;
        Calculador instance = new Calculador();
        double expResult = 2.0;
        double result = instance.restar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculador.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double numero1 = 4.0;
        double numero2 = 5.0;
        Calculador instance = new Calculador();
        double expResult = 20.0;
        double result = instance.multiplicar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculador.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double numero1 = 8.0;
        double numero2 = 2.0;
        Calculador instance = new Calculador();
        double expResult = 4.0;
        double result = instance.dividir(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
