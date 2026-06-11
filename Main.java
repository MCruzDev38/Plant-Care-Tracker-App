package com.michelle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PlantDatabase.createTable();

        int choice;

        do {
            System.out.println("\nPlant Care Tracker");
            System.out.println("1. Add Plant");
            System.out.println("2. View All Plants");
            System.out.println("3. Update Plant");
            System.out.println("4. Delete Plant");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter plant name: ");
                    String name = input.nextLine();

                    System.out.print("Enter plant type: ");
                    String type = input.nextLine();

                    System.out.print("Enter watering frequency: ");
                    String wateringFrequency = input.nextLine();

                    System.out.print("Enter sunlight needs: ");
                    String sunlight = input.nextLine();

                    System.out.print("Enter notes: ");
                    String notes = input.nextLine();

                    Plant plant = new Plant(name, type, wateringFrequency, sunlight, notes);
                    PlantDatabase.addPlant(plant);
                    break;

                case 2:
                    PlantDatabase.viewPlants();
                    break;

                case 3:
                    System.out.print("Enter plant ID to update: ");
                    int updateId = Integer.parseInt(input.nextLine());

                    System.out.print("Enter new watering frequency: ");
                    String newWateringFrequency = input.nextLine();

                    System.out.print("Enter new notes: ");
                    String newNotes = input.nextLine();

                    PlantDatabase.updatePlant(updateId, newWateringFrequency, newNotes);
                    break;

                case 4:
                    System.out.print("Enter plant ID to delete: ");
                    int deleteId = Integer.parseInt(input.nextLine());

                    PlantDatabase.deletePlant(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
