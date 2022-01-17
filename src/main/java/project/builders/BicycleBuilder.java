package project.builders;

import project.entity.Bicycle;
import project.utils.VehicleInfo;

public class BicycleBuilder implements VehicleInfo {
    Bicycle bicycle = new Bicycle("No", "Ukraine", "Dnepr", "No", "Shvidka Anastasia Volodimirivna", "No", "City");

    public void printInfo() {
        System.out.println("Print the bicycle: " + bicycle.toString());
    }

    public void refuel() {

    }

    public void repair() {

    }

    public void service() {

    }

    public void inspection() {

    }
}
