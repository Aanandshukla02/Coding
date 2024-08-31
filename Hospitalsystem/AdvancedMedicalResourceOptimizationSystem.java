import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class AdvancedMedicalResourceOptimizationSystem {
    static int patientIDCounter = 1000;
    static PriorityBlockingQueue<Patient> patientQueue = new PriorityBlockingQueue<>();
    static Map<String, Integer> bedAvailability = new HashMap<>(Map.of(
            "General Ward", 10,
            "Deluxe Room", 5,
            "Private Room", 3,
            "Suite Room", 2,
            "Semi-Private", 4
    ));
    static Map<Integer, Patient> patientHistory = new HashMap<>();
    static Random random = new Random();

    static class Patient implements Comparable<Patient> {
        String name;
        int age;
        String condition;
        String bedType;
        int id;
        int treatmentDays;
        int bedCharges;
        Map<String, String> prescription;
        String nurseAssigned;

        Patient(String name, int age, String condition, String bedType, int treatmentDays, int bedCharges) {
            this.name = name;
            this.age = age;
            this.condition = condition;
            this.bedType = bedType;
            this.id = ++patientIDCounter;
            this.treatmentDays = treatmentDays;
            this.bedCharges = bedCharges;
            this.prescription = new HashMap<>();
            this.nurseAssigned = assignNurse(condition);
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(this.treatmentDays, other.treatmentDays);
        }
    }

    static Map<String, Integer> bedChargesMap = Map.of(
            "General Ward", 1000,
            "Deluxe Room", 4000,
            "Private Room", 3000,
            "Suite Room", 5000,
            "Semi-Private", 2000
    );

    static Map<String, Integer> treatmentDaysMap = Map.of(
            "Headache", 3,
            "Accident", 15,
            "Fever", 7,
            "Broken Leg", 30,
            "Flu", 5
    );

    static Map<String, Map<String, String>> conditionMedicines = Map.of(
            "Headache", Map.of("Paracetamol", "2 tablets", "Ibuprofen", "1 tablet"),
            "Accident", Map.of("Antibiotic", "2 tablets", "Painkiller", "1 tablet"),
            "Fever", Map.of("Acetaminophen", "2 tablets", "Fluids", "500ml"),
            "Broken Leg", Map.of("Calcium", "1 tablet", "Painkiller", "2 tablets"),
            "Flu", Map.of("Antiviral", "1 tablet", "Cough Syrup", "10ml")
    );

    static Map<String, Integer> medicineCosts = Map.of(
            "Paracetamol", 50,
            "Ibuprofen", 100,
            "Antibiotic", 200,
            "Painkiller", 150,
            "Acetaminophen", 80,
            "Fluids", 500,
            "Calcium", 100,
            "Antiviral", 300,
            "Cough Syrup", 120
    );

    static String assignNurse(String condition) {
        // Simple random nurse assignment based on condition
        String[] nurses = {"Nurse A", "Nurse B", "Nurse C", "Nurse D"};
        return nurses[random.nextInt(nurses.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patient Queue");
            System.out.println("3. View Patient History");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1 -> registerPatient(scanner);
                case 2 -> viewPatientQueue();
                case 3 -> viewPatientHistory(scanner);
                case 4 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    static void registerPatient(Scanner scanner) {
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.println("Select Condition:");
        for (String condition : treatmentDaysMap.keySet()) {
            System.out.println(condition + " (Estimated recovery: " + treatmentDaysMap.get(condition) + " days)");
        }
        String condition = scanner.nextLine();

        System.out.println("Select Bed Type:");
        for (String bedType : bedChargesMap.keySet()) {
            System.out.println(bedType + " (Charge: ₹" + bedChargesMap.get(bedType) + ")");
        }
        String bedType = scanner.nextLine();

        if (bedAvailability.get(bedType) == 0) {
            System.out.println("No beds available in " + bedType + ". Please choose another bed type or join the waitlist.");
            // Option to add to waitlist could be implemented here
            return;
        }

        bedAvailability.put(bedType, bedAvailability.get(bedType) - 1);
        int treatmentDays = treatmentDaysMap.get(condition);
        int bedCharges = bedChargesMap.get(bedType) * treatmentDays;

        Patient patient = new Patient(name, age, condition, bedType, treatmentDays, bedCharges);
        patientQueue.add(patient);
        patientHistory.put(patient.id, patient);  // Save patient to history
        System.out.println("Patient registered with ID: " + patient.id);

        // Simulate the process of seeing a doctor, pharmacy, and billing
        processPatient(patient);
    }

    static void viewPatientQueue() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue.");
        } else {
            System.out.println("Current Patient Queue:");
            for (Patient patient : patientQueue) {
                System.out.println("ID: " + patient.id + ", Name: " + patient.name + ", Condition: " + patient.condition + ", Bed Type: " + patient.bedType);
            }
        }
    }

    static void viewPatientHistory(Scanner scanner) {
        System.out.print("Enter Patient ID to view history: ");
        int patientID = scanner.nextInt();

        Patient patient = patientHistory.get(patientID);
        if (patient == null) {
            System.out.println("No patient found with ID " + patientID);
        } else {
            System.out.println("\nPatient History:");
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Condition: " + patient.condition);
            System.out.println("Bed Type: " + patient.bedType);
            System.out.println("Nurse Assigned: " + patient.nurseAssigned);
            System.out.println("Prescription: " + patient.prescription);
        }
    }

    static void processPatient(Patient patient) {
        // Simulate doctor diagnosis and prescription
        System.out.println("\n--- Processing Patient at Doctor ---");
        System.out.println("Doctor diagnosed " + patient.name + " with " + patient.condition);

        // Doctor prescribes medicines
        Map<String, String> prescribedMedicines = conditionMedicines.get(patient.condition);
        patient.prescription.putAll(prescribedMedicines);

        System.out.println("\n--- Prescription and Pharmacy ---");
        int totalMedicineCost = 0;
        System.out.println("Prescription for " + patient.condition + ":");
        for (String medicine : prescribedMedicines.keySet()) {
            System.out.println(medicine + ": " + prescribedMedicines.get(medicine));
            totalMedicineCost += medicineCosts.get(medicine);
        }
        System.out.println("Total Medicine Cost: ₹" + totalMedicineCost);
        System.out.println("Proceed to billing...");

        // Final billing and discharge
        finalBillingAndDischarge(patient, totalMedicineCost);
    }

    static void finalBillingAndDischarge(Patient patient, int medicineCost) {
        int totalBill = patient.bedCharges + medicineCost;

        System.out.println("\n--- Final Billing and Discharge ---");
        System.out.println("Patient Name: " + patient.name);
        System.out.println("Age: " + patient.age);
        System.out.println("Condition: " + patient.condition);
        System.out.println("Bed Type: " + patient.bedType);
        System.out.println("Nurse Assigned: " + patient.nurseAssigned);
        System.out.println("Total Bed Charges: ₹" + patient.bedCharges);
        System.out.println("Total Medicine Charges: ₹" + medicineCost);
        System.out.println("Treatment Duration: " + patient.treatmentDays + " days");
        System.out.println("Final Bill for " + patient.name + ": ₹" + totalBill);

        try {
            Thread.sleep(5000);  // 5-second delay before discharge
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Thank you for visiting the hospital!");

        // After discharge, free the bed
        bedAvailability.put(patient.bedType, bedAvailability.get(patient.bedType) + 1);
    }
}
