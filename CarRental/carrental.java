import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ConsoleColors {
    public static final String RESET = "\033[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String PURPLE_BOLD = "\033[1;35m";
}

class Car {
    private String carId;
    private String brand;
    private String model;
    private double ratePerDay;
    private double kmDriven;
    private LocalDate maintenanceDueDate;
    private String type;
    private boolean isRented;

    public Car(String carId, String brand, String model, double ratePerDay, double kmDriven, LocalDate maintenanceDueDate, String type) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.ratePerDay = ratePerDay;
        this.kmDriven = kmDriven;
        this.maintenanceDueDate = maintenanceDueDate;
        this.type = type;
        this.isRented = false;
    }

    public String getCarId() { return carId; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getRatePerDay() { return ratePerDay; }
    public String getType() { return type; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { isRented = rented; }
    public LocalDate getMaintenanceDueDate() { return maintenanceDueDate; }
    public void setMaintenanceDueDate(LocalDate maintenanceDueDate) { this.maintenanceDueDate = maintenanceDueDate; }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
}

class CarRentalSystem {
    List<Car> cars = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerById(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void rentCar(Car car, Customer customer, int days) {
        if (car.isRented()) {
            System.out.println(ConsoleColors.RED_BOLD + "Car is already rented." + ConsoleColors.RESET);
            return;
        }
        double totalCost = car.getRatePerDay() * days;
        car.setRented(true);
        System.out.println(ConsoleColors.GREEN_BOLD + "Car rented successfully!" + ConsoleColors.RESET);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Car: " + car.getBrand() + " " + car.getModel());
        System.out.println("Total Rent: INR " + totalCost);
    }

    public void returnCar(Car car) {
        if (!car.isRented()) {
            System.out.println(ConsoleColors.RED_BOLD + "Car is not currently rented." + ConsoleColors.RESET);
            return;
        }
        car.setRented(false);
        System.out.println(ConsoleColors.GREEN_BOLD + "Car returned successfully!" + ConsoleColors.RESET);
    }

    public void showMaintenanceDue() {
        boolean found = false;
        LocalDate today = LocalDate.now();
        for (Car car : cars) {
            if (car.getMaintenanceDueDate().isBefore(today)) {
                System.out.println(ConsoleColors.PURPLE_BOLD + "Maintenance due for Car ID: " + car.getCarId() + " (" + car.getBrand() + " " + car.getModel() + ")" + ConsoleColors.RESET);
                found = true;
            }
        }
        if (!found) {
            System.out.println(ConsoleColors.GREEN_BOLD + "No cars due for maintenance." + ConsoleColors.RESET);
        }
    }

    public void performMaintenance(Car car) {
        car.setMaintenanceDueDate(LocalDate.now().plusMonths(6));
        System.out.println(ConsoleColors.GREEN_BOLD + "Maintenance performed for Car ID: " + car.getCarId() + " (" + car.getBrand() + " " + car.getModel() + ")" + ConsoleColors.RESET);
    }

    public void recommendCarProcess(Scanner scanner) {
        System.out.print("Enter purpose (off-road, family, business, luxury, commute): ");
        String purpose = scanner.nextLine();

        List<Car> recommendedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getType().equalsIgnoreCase(purpose) && !car.isRented()) {
                recommendedCars.add(car);
            }
        }

        if (recommendedCars.isEmpty()) {
            System.out.println(ConsoleColors.RED_BOLD + "No cars available for the selected purpose." + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.PURPLE_BOLD + "Recommended Cars:" + ConsoleColors.RESET);
            for (Car car : recommendedCars) {
                System.out.println(ConsoleColors.YELLOW_BOLD + car.getCarId() + " - " + car.getBrand() + " " + car.getModel() + " (" + car.getType() + ")" + ConsoleColors.RESET);
            }
        }
    }

    public String generateCustomerId() {
        return "CUST" + (customers.size() + 1);
    }
}

public class carrental{
    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();

        // Adding 50 Cars
        system.addCar(new Car("CAR001", "Toyota", "Fortuner", 100, 5000, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR002", "Honda", "Civic", 80, 3000, LocalDate.now().plusMonths(6), "business"));
        system.addCar(new Car("CAR003", "BMW", "X5", 150, 7000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR004", "Audi", "Q7", 160, 7500, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR005", "Mercedes", "Benz", 170, 8000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR006", "Ford", "Endeavour", 120, 6000, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR007", "Hyundai", "Creta", 90, 3500, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR008", "Kia", "Seltos", 95, 3700, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR009", "Maruti", "Vitara Brezza", 85, 3200, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR010", "Nissan", "Kicks", 100, 4500, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR011", "Tata", "Harrier", 110, 5000, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR012", "Mahindra", "XUV500", 105, 4800, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR013", "Skoda", "Octavia", 80, 2800, LocalDate.now().plusMonths(6), "business"));
        system.addCar(new Car("CAR014", "Volkswagen", "Passat", 85, 2900, LocalDate.now().plusMonths(6), "business"));
        system.addCar(new Car("CAR015", "Jaguar", "XE", 160, 7200, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR016", "Land Rover", "Discovery", 180, 8000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR017", "Porsche", "Macan", 200, 9000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR018", "Chevrolet", "Equinox", 90, 3500, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR019", "Buick", "Enclave", 95, 3700, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR020", "Jeep", "Compass", 110, 4500, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR021", "Mazda", "CX-5", 95, 3600, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR022", "Subaru", "Outback", 105, 4000, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR023", "Tesla", "Model X", 180, 8200, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR024", "Volvo", "XC90", 170, 7900, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR025", "Honda", "CR-V", 100, 3300, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR026", "Toyota", "Highlander", 120, 4200, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR027", "Hyundai", "Tucson", 85, 3000, LocalDate.now().plusMonths(6), "commute"));
        system.addCar(new Car("CAR028", "Kia", "Sorento", 95, 3400, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR029", "Nissan", "Rogue", 90, 3200, LocalDate.now().plusMonths(6), "commute"));
        system.addCar(new Car("CAR030", "Ford", "Escape", 100, 3500, LocalDate.now().plusMonths(6), "commute"));
        system.addCar(new Car("CAR031", "Chevrolet", "Traverse", 110, 3800, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR032", "GMC", "Acadia", 120, 4100, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR033", "Jeep", "Wrangler", 130, 4800, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR034", "Lexus", "RX", 140, 5000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR035", "BMW", "X3", 150, 5500, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR036", "Audi", "Q5", 160, 5700, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR037", "Mercedes", "GLC", 170, 6000, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR038", "Porsche", "Cayenne", 200, 7200, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR039", "Volkswagen", "Atlas", 90, 3200, LocalDate.now().plusMonths(6), "commute"));
        system.addCar(new Car("CAR040", "Volvo", "XC60", 140, 4500, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR041", "Tesla", "Model Y", 150, 4700, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR042", "Subaru", "Forester", 100, 3400, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR043", "Mazda", "CX-9", 120, 4200, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR044", "Land Rover", "Range Rover", 180, 7400, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR045", "Jaguar", "F-Pace", 160, 6900, LocalDate.now().plusMonths(6), "luxury"));
        system.addCar(new Car("CAR046", "GMC", "Yukon", 130, 4800, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR047", "Toyota", "4Runner", 120, 4200, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR048", "Honda", "Pilot", 110, 3900, LocalDate.now().plusMonths(6), "family"));
        system.addCar(new Car("CAR049", "Ford", "Bronco", 140, 5100, LocalDate.now().plusMonths(6), "off-road"));
        system.addCar(new Car("CAR050", "Chevrolet", "Tahoe", 150, 5300, LocalDate.now().plusMonths(6), "luxury"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(ConsoleColors.YELLOW_BOLD + "Car Rental System Menu" + ConsoleColors.RESET);
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Show Maintenance Due");
            System.out.println("4. Perform Maintenance");
            System.out.println("5. Recommend a Car");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    String rentCarId = scanner.nextLine();
                    Car carToRent = null;
                    for (Car car : system.cars) {
                        if (car.getCarId().equals(rentCarId)) {
                            carToRent = car;
                            break;
                        }
                    }
                    if (carToRent == null) {
                        System.out.println(ConsoleColors.RED_BOLD + "Car ID not found." + ConsoleColors.RESET);
                        break;
                    }

                    System.out.print("Do you have a Customer ID? (yes/no): ");
                    String hasCustomerId = scanner.nextLine();

                    Customer customer = null;

                    if (hasCustomerId.equalsIgnoreCase("yes")) {
                        System.out.print("Enter Customer ID: ");
                        String customerId = scanner.nextLine();
                        customer = system.findCustomerById(customerId);
                        if (customer == null) {
                            System.out.println(ConsoleColors.RED_BOLD + "Customer ID not found." + ConsoleColors.RESET);
                            break;
                        }
                    } else {
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        String newCustomerId = system.generateCustomerId();
                        customer = new Customer(newCustomerId, name);
                        system.addCustomer(customer);
                        System.out.println(ConsoleColors.GREEN_BOLD + "New Customer ID created: " + newCustomerId + ConsoleColors.RESET);
                    }

                    System.out.print("Enter number of days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    system.rentCar(carToRent, customer, days);
                    break;

                case 2:
                    System.out.print("Enter Car ID: ");
                    String returnCarId = scanner.nextLine();
                    Car carToReturn = null;
                    for (Car car : system.cars) {
                        if (car.getCarId().equals(returnCarId)) {
                            carToReturn = car;
                            break;
                        }
                    }
                    if (carToReturn == null) {
                        System.out.println(ConsoleColors.RED_BOLD + "Car ID not found." + ConsoleColors.RESET);
                        break;
                    }
                    system.returnCar(carToReturn);
                    break;

                case 3:
                    system.showMaintenanceDue();
                    break;

                case 4:
                    System.out.print("Enter Car ID: ");
                    String maintenanceCarId = scanner.nextLine();
                    Car carForMaintenance = null;
                    for (Car car : system.cars) {
                        if (car.getCarId().equals(maintenanceCarId)) {
                            carForMaintenance = car;
                            break;
                        }
                    }
                    if (carForMaintenance == null) {
                        System.out.println(ConsoleColors.RED_BOLD + "Car ID not found." + ConsoleColors.RESET);
                        break;
                    }
                    system.performMaintenance(carForMaintenance);
                    break;

                case 5:
                    system.recommendCarProcess(scanner);
                    break;

                case 6:
                    System.out.println(ConsoleColors.GREEN_BOLD + "Thank you for using the Car Rental System!" + ConsoleColors.RESET);
                    scanner.close();
                    return;

                default:
                    System.out.println(ConsoleColors.RED_BOLD + "Invalid choice." + ConsoleColors.RESET);
            }
        }
    }
}
