package Interfaces;

import Interfaces.Enums.PaintFinish;

import java.awt.Color;

public interface Exterior {

    /**
     * returns the color of the exterior
     * @return
     */

    Color getColor();

    /**
     * returns the type of paint finish on the car
     * @return
     */

    PaintFinish getFinish();

}
