import java.awt.Color;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Car(new HybridEngine(), new CarInterior(Color.BLACK), new CarExterior(Color.GRAY));
    }

}
