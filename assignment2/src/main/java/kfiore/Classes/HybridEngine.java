package Classes;

import Interfaces.Engine;
import Interfaces.Enums.FuelType;

public class HybridEngine implements Engine {

    /**
     * Builds the hybrid engine model to be used for Car
     * @return
     */

    @Override
    public int getMPG() {
        return 52;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GAS.ELECTRIC;
    }
}
