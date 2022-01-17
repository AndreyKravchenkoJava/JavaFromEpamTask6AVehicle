package project.builders;

import project.entity.Car;
import project.utils.VehicleInfo;

public class CarBuilder implements VehicleInfo {
    Car car = new Car("AE 1111 BA", "BMW", "328I", "WBA3B5C57DP539172", "Kravchenko Andrey Vitalievich", "Internal combustion engine", 300, true, false);

    public void printInfo() {
        System.out.println("Print the car: " + car.toString());
    }

    public void refuel() {
        if (car.isTankCondition() == true) {
            System.out.println("Car does not need refueling");
        } else {
            if (car.isTankCondition() == false) {
                System.out.println("Car is filled");
            }
        }
        System.out.println();
    }

    public void repair() {
        if (car.isDefect() == true) {
            System.out.println("Car repaired");
        } else {
            if (car.isDefect() == false) {
                System.out.println("Car does not need repair");
            }
        }
    }

    public void service() {
        if (car.isDefect() == true) {
            System.out.println("Car repaired");
        } else {
            if (car.isDefect() == false) {
                System.out.println("Car does not need repair");
            }
        }
    }

    public void inspection() {
        if (car.isDefect() == true) {
            System.out.println("Car requires replacement of oil, candles, pads");
        } else {
            if (car.isDefect() == false) {
                System.out.println("Car is in order and does not require replacement of consumables");
            }
        }
    }
}
