package Classes;

import Interfaces.Engine;
import Interfaces.Exterior;
import Interfaces.Interior;

public class Car  {

    /**
     * Required components of Car listed below
     */

    private Engine engine;
    private Interior interior;
    private Exterior exterior;

    /**
     * Build Car
     *
     * @param engine
     * @param interior
     * @param exterior
     */

    public Car(Engine engine, Interior interior, Exterior exterior) {
        this.engine = engine;
        this.interior = interior;
        this.exterior = exterior;
    }

    public Engine getEngine() {
        return engine;
    }

    public Interior getInterior() {
        return interior;
    }

    public Exterior getExterior() {
        return exterior;
    }
}
