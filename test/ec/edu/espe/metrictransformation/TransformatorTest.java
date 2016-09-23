/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.metrictransformation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander
 */
public class TransformatorTest {
    
    public TransformatorTest() {
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
     * Test of transformation method, of class Transformator.
     */
    @Test
    public void testTransformation() {
        System.out.println("transformation");
        double value = 10.0F;
        double initialUnit = 100F;
        double outputUnit = 0.001F;
        double expResult = value*initialUnit/outputUnit;
        double result = Transformator .transformation(value, initialUnit, outputUnit);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testTransformation2() {
        System.out.println("transformation");
        double value = 20.0F;
        double initialUnit = 1000F;
        double outputUnit = 100F;
        double expResult = value*initialUnit/outputUnit;
        double result = Transformator .transformation(value, initialUnit, outputUnit);
        assertEquals(expResult, result, 0.0);
    }
}
