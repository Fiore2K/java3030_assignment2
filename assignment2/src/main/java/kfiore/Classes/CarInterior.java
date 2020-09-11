import Interfaces.Interior;

import java.awt.Color;

public class CarInterior implements Interior {

    private Color color;

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
