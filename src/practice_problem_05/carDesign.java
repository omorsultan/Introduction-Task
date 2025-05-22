package practice_problem_05;
class Car {
    // Attributes
    private String owner;
    private String brand;
    private String serialNumber;
    private double fuelLevel;
    private boolean isRunning;


    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. Fuel is empty.");
        }
    }

    public void stopCar() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters.");
    }



}
public class carDesign {

        public static void main(String[] args) {
            Car myCar = new Car("Omor", "Toyota", "SN123456", 10.5);
            myCar.checkFuel();
            myCar.startCar();
            myCar.stopCar();

        }

}
