package Classes;

import java.awt.Color;

public class CarApp {

    /**
     * Main method for CarApp found below
     *
     * @param args
     */

    public static void main(String[] args) {
        Car car = new Car(new HybridEngine(), new CarInterior(Color.BLACK), new CarExterior(Color.GRAY));
    }

}
