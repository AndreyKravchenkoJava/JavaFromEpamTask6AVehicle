package project.builders;

import project.entity.Motorcycle;
import project.utils.VehicleInfo;

public class MotorcycleBuilder implements VehicleInfo {
    Motorcycle motorcycle = new Motorcycle("AE 2222 TE", "Suzuki", "GSX-R1000", "JTNBF3HKR0337YE376", "Koliagin Danil Sergeevich", "Internal combustion engine", "Racing", false, true);

    public void printInfo() {
        System.out.println("Print the motorcycle: " + motorcycle.toString());
    }

    public void refuel() {
        if (motorcycle.isPaintCondition() == true) {
            System.out.println("Motorcycle does not need refueling");
        } else {
            if (motorcycle.isPaintCondition() == false) {
                System.out.println("Motorcycle is filled");
            }
        }
        System.out.println();
    }

    public void repair() {
        if (motorcycle.isDefect() == true) {
            System.out.println("Motorcycle repaired");
        } else {
            if (motorcycle.isDefect() == false) {
                System.out.println("Motorcycle does not need repair");
            }
        }
    }

    public void service() {
        if (motorcycle.isDefect() == true) {
            System.out.println("Motorcycle repaired");
        } else {
            if (motorcycle.isDefect() == false) {
                System.out.println("Motorcycle does not need repair");
            }
        }
    }

    public void inspection() {
        if (motorcycle.isPaintCondition() == true) {
            System.out.println("Motorcycle requires painting");
        } else {
            if (motorcycle.isPaintCondition() == false) {
                System.out.println("Motorcycle is in order and does not require replacement of consumables");
            }
        }
    }
}
