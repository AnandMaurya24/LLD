package strategyDesignPaterrn;

import strategyDesignPaterrn.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
