package strategyDesignPaterrn;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportyVehicle();
        vehicle.drive();

        Vehicle normalVehicle=new NormalVehicle();
        normalVehicle.drive();
    }
}
