package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;




public class VehicleInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] cars = new Vehicle[20];

        cars[0] = new Vehicle(123456, "Kia K5", "Slate grey", 45000, 25000);
        cars[1] = new Vehicle(234567, "Dodge Charger", "Black", 55000, 35000);
        cars[2] = new Vehicle(345678, "Porche Cayman", "Yellow", 36000, 55000);
        cars[3] = new Vehicle(456789, "Kia Stinger", "Hi Chroma Red", 80000, 40000);
        cars[4] = new Vehicle(567890, "Mclaren P1", "Orange", 12000, 2200000);

        int command = 0;

        while (command !=6) {

                System.out.println("""
                        What do you want to do?
                        1 - List all vehicles
                        2 - Search by make/model
                        3 - Search by price range
                        4 - Search by color
                        5 - Add a vehicle
                        6 - Quit
                        Enter your command: """);

                        command = scanner.nextInt();
                        scanner.nextLine();

                        switch (command) {
                            case 1:
                                System.out.println("Vehicle Inventory: ");

                                for (Vehicle car : cars) {
                                    if (car != null){
                                        System.out.println(car);

                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Search by Make and Model..");

                                System.out.println("Please enter the make and model..");
                                String searchmakeModel = scanner.nextLine();

                                boolean foundmm = false;

                                for (Vehicle car : cars) {
                                    if (car != null && car.getMakeModel().equalsIgnoreCase(searchmakeModel)) {

                                        System.out.println(car);
                                        foundmm = true;
                                    }
                                }
                                if (!foundmm) {
                                    System.out.println("Vehicle not found.");
                                }
                                    break;

                            case 3:
                                System.out.println("Search by price range..");
                                break;

                            case 4:
                                System.out.println("Search by color..");

                                System.out.println("Please enter the color");
                                String searchcolor = scanner.nextLine();

                                boolean foundc = false;

                                for (Vehicle car : cars) {
                                    if (car != null && car.getColor().equalsIgnoreCase(searchcolor)) {

                                        System.out.println(car);
                                        foundc = true;
                                    }
                                }
                                if (!foundc) {
                                    System.out.println("Vehicle not found.");
                                }
                                break;

                            case 5:
                                System.out.println("Add a new vehicle..");

                                System.out.print("Enter Vehicle ID: ");
                                long vehicleId = scanner.nextLong();
                                scanner.nextLine();

                                System.out.print("Enter Make/Model: ");
                                String makeModel = scanner.nextLine();

                                System.out.print("Enter Color: ");
                                String color = scanner.nextLine();

                                System.out.print("Enter Odometer Reading: ");
                                int odometerReading = scanner.nextInt();

                                System.out.print("Enter Price: ");
                                double price = scanner.nextDouble();
                                scanner.nextLine();

                                Vehicle newVehicle = new Vehicle(
                                        vehicleId,
                                        makeModel,
                                        color,
                                        odometerReading,
                                        price);

                                for (int i = 0; i < cars.length; i++) {
                                    if (cars[i] == null) {
                                        cars[i] = newVehicle;
                                        System.out.println("Vehicle added successfully!");
                                        break;
                                    }
                                }
                                break;

                            case 6:
                                System.out.println("Farewell!..");
                                break;

                            default:
                                System.out.println("Error! Please try again..");
                       }

                            System.out.println();






            //public static void find


        }
    }
    }