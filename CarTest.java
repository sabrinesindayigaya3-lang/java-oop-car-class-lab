public class CarTest {
    public static void main(String[] args) {

        System.out.println("Welcome to Car Management System!");

        // --- Car 1 ---
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2020;
        car1.mileage = 0.0;
        Car.totalCars++;
        car1.displayInfo();

        // --- Car 2 ---
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2022;
        car2.mileage = 0.0;
        Car.totalCars++;
        car2.displayInfo();

        // Show total so far
        Car.showTotalCars();

        // --- Drive the cars ---
        System.out.println("--- Let's drive the cars! ---");
        car1.drive(50.5);
        car1.drive(30.0);
        System.out.println();
        car2.drive(100.0);

        // --- Updated info ---
        System.out.println("--- Updated Car Information ---");
        car1.displayInfo();
        car2.displayInfo();

        // --- Loop to create 3 more cars ---
        System.out.println("--- Creating 3 more cars using a loop ---");
        for (int i = 1; i <= 3; i++) {
            Car car = new Car();
            car.brand = "Brand " + i;
            car.color = "Color " + i;
            car.year = 2020 + i;
            car.mileage = 0.0;
            Car.totalCars++;
            car.displayInfo();
        }

        // Final total
        Car.showTotalCars();
    }
}