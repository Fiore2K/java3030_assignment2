package Classes;

import Interfaces.Enums.MaterialType;
import Interfaces.Interior;

import java.awt.Color;

public class CarInterior implements Interior {

    private Color color;

    /**
     * Builds the required components for interior of Car
     * @param colorValue
     */

    public CarInterior(Color colorValue) {
        this.color = colorValue;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.LEATHER;
    }

    @Override
    public int getSize() {
        return 5;
    }
}
