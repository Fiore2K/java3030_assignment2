import Interfaces.Engine;

public class HybridEngine implements Engine {
    @Override
    public int getMPG() {
        return 52;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GAS.ELECTRIC;
    }
}
