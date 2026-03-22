public class Car {
    // Instance variables
    String brand;
    String color;
    int year;
    double mileage;

    // Static variable
    static int totalCars = 0;

    // Display car info
    void displayInfo() {
        System.out.println("=== Car Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println();
    }

    // Drive the car
    void drive(double distance) {
        double oldMileage = mileage;   // local variable
        mileage = mileage + distance;
        System.out.println("Driving " + distance + " km...");
        System.out.println("Mileage increased from " + oldMileage + " to " + mileage + " km");
    }

    // Static method to show total cars
    static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }
}