package project.builders;

import project.entity.ATV;
import project.utils.VehicleInfo;

public class ATVBuilder implements VehicleInfo {
    ATV atv = new ATV("AE 3333 BE", "Yamaha", "BE-293", "WBA3B5C57DP539172", "Shevchenko Danil Olegovich", "Electro", "sports");

    public void printInfo() {
        System.out.println("Print the ATV: " + atv.toString());
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
