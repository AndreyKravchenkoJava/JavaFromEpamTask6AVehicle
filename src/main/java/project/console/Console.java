package project.console;

import project.builders.*;
import project.entity.Motorcycle;
import project.entity.Scooter;

import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);
    CarBuilder carBuilder = new CarBuilder();
    ScooterBuilder scooterBuilder = new ScooterBuilder();
    MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
    BicycleBuilder bicycleBuilder = new BicycleBuilder();
    ATVBuilder atvBuilder = new ATVBuilder();

    public Console() {
        this.carBuilder = carBuilder;
        this.scooterBuilder = scooterBuilder;
        this.motorcycleBuilder = motorcycleBuilder;
        this.bicycleBuilder = bicycleBuilder;
        this.atvBuilder = atvBuilder;
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        message();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "1": {
                carBuilder.printInfo();
                break;
            }
            case "2": {
                scooterBuilder.printInfo();
                break;
            }
            case "3": {
                motorcycleBuilder.printInfo();
                break;
            }
            case "4": {
                bicycleBuilder.printInfo();
                break;
            }
            case "5": {
                atvBuilder.printInfo();
                break;
            }
            case "6": {
                carBuilder.refuel();
                break;
            }
            case "7": {
                carBuilder.repair();
                break;
            }
            case "8": {
                carBuilder.inspection();
                break;
            }
            case "9": {
                carBuilder.service();
                break;
            }
            case "q": {
                motorcycleBuilder.inspection();
                break;
            }
            case "w": {
                motorcycleBuilder.refuel();
                break;
            }
            case "e": {
                motorcycleBuilder.repair();
                break;
            }
            case "r": {
                motorcycleBuilder.service();
                break;
            }
            default: {
                System.out.println("Your wrong input choice");
            }
        }
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void message() {
        System.out.println("-----------------------------------------------");
        System.out.println("1 - print car info");
        System.out.println("2 - print scooter info");
        System.out.println("3 - print motorcycle info");
        System.out.println("4 - print bicycle info");
        System.out.println("5 - print ATV info");
        System.out.println("6 - refuel car");
        System.out.println("7 - repair car");
        System.out.println("8 - inspection car");
        System.out.println("9 - service car");
        System.out.println("q - inspection motorcycle");
        System.out.println("w - refuel motorcycle");
        System.out.println("e - repair motorcycle");
        System.out.println("r - service motorcycle");
    }
}
