public class ElectricCar extends Car {
    private int batteryLevel;

    // Constructor calling the Car super constructor
    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
        }
    }

   
    public void accelerate(int amount) {
        super.accelerate(amount);
        if (batteryLevel > 0) {
            this.batteryLevel -= 1;
        }
    }

   
    public void describe() {
        super.describe();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
    }
}