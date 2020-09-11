package Interfaces;

import Interfaces.Enums.FuelType;

public interface Engine {

    /**
     * Returns MPG of the engine
     * @return
     */

    int getMPG();

    /**
     * Returns the type of fuel used in the engine
     * @return
     */

    FuelType getFuelType();

}
