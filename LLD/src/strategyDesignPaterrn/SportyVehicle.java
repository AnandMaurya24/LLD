package strategyDesignPaterrn;

import strategyDesignPaterrn.Strategy.DriveStrategy;
import strategyDesignPaterrn.Strategy.SportsDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle() {
        super(new SportsDriveStrategy() );
    }
}
