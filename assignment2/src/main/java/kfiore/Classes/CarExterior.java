import Interfaces.Exterior;

import java.awt.Color;

public class CarExterior implements Exterior {

    private Color color;

    public CarExterior(Color colorValue) {
        this.color = colorValue;
    }
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public PaintFinish getFinish() {
        return PaintFinish.METALLIC;
    }
}
