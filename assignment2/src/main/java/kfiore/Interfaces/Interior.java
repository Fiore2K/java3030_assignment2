package Interfaces;

import Interfaces.Enums.MaterialType;

import java.awt.Color;

public interface Interior {

    /**
     * returns the color of the interior
     * @return
     */

    Color getColor();

    /**
     * returns the type of material in the car
     * @return
     */

    MaterialType getMaterial();

    /**
     * returns the number of people who can safely travel in the car
     * @return
     */

    int getSize();

}
