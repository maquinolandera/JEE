/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaSolar;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class SistemaTest {
    
    public SistemaTest() {
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
     * Test of getPlaneta method, of class Sistema.
     */
    @Test
    public void testGetPlaneta() {
        System.out.println("getPlaneta");
        Sistema instance = new Sistema();
        Planeta expResult = null;
        Planeta result = instance.getPlaneta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlaneta method, of class Sistema.
     */
    @Test
    public void testSetPlaneta() {
        System.out.println("setPlaneta");
        Planeta planeta = null;
        Sistema instance = new Sistema();
        instance.setPlaneta(planeta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSol method, of class Sistema.
     */
    @Test
    public void testGetSol() {
        System.out.println("getSol");
        Sistema instance = new Sistema();
        Sol expResult = null;
        Sol result = instance.getSol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSol method, of class Sistema.
     */
    @Test
    public void testSetSol() {
        System.out.println("setSol");
        Sol sol = null;
        Sistema instance = new Sistema();
        instance.setSol(sol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Sistema.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Sistema instance = new Sistema();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Sistema.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Sistema instance = new Sistema();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanetas method, of class Sistema.
     */
    @Test
    public void testGetPlanetas() {
        System.out.println("getPlanetas");
        Sistema instance = new Sistema();
        List<Planeta> expResult = null;
        List<Planeta> result = instance.getPlanetas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlanetas method, of class Sistema.
     */
    @Test
    public void testSetPlanetas() {
        System.out.println("setPlanetas");
        Planeta planetas = null;
        Sistema instance = new Sistema();
        instance.setPlanetas(planetas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstrella method, of class Sistema.
     */
    @Test
    public void testGetEstrella() {
        System.out.println("getEstrella");
        Sistema instance = new Sistema();
        List<Sol> expResult = null;
        List<Sol> result = instance.getEstrella();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstrella method, of class Sistema.
     */
    @Test
    public void testSetEstrella() {
        System.out.println("setEstrella");
        Sol e = null;
        Sistema instance = new Sistema();
        instance.setEstrella(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Sistema.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Sistema instance = new Sistema();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Sistema.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Sistema instance = new Sistema();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
