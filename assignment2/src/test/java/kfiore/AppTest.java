package kfiore;

import Classes.Car;
import Classes.CarExterior;
import Classes.CarInterior;
import Classes.HybridEngine;
import Interfaces.Engine;
import Interfaces.Exterior;
import Interfaces.Interior;
import org.junit.Before;
import org.junit.Test;
import java.awt.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * JUnit test for CarApp
 */

public class AppTest
{
    /**
     * All variables required listed here
     */

    Engine engine;
    Color color;
    Interior interior;
    Exterior exterior;
    Car car;

    /**
     * Build Car before running test
     */

    @Before
    public void setUp() {
        this.engine = new HybridEngine();
        this.color = Color.BLACK;
        this.interior = new CarInterior(this.color);
        this.color = Color.GRAY;
        this.exterior = new CarExterior(this.color);
        this.car = new Car(engine, interior, exterior);
    }

    /**
     * Test if car is built or missing components
     */

    @Test
    public void testCarApp(){
        assertNotNull("testCarApp failed", car);
    }

    /**
     * Test for engine
     */

    @Test
    public void getEngine() {
        assertEquals("Engine is correct", this.engine, car.getEngine());
    }

    /**
     * Test for interior
     */

    @Test
    public void getInterior() {
        assertEquals("Interior is correct", this.interior, car.getInterior());
    }

    /**
     * Test for exterior
     */

    @Test
    public void getExterior() {
        assertEquals("Exterior is correct", this.exterior, car.getExterior());
    }
}