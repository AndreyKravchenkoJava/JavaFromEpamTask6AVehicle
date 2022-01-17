package project.builders;

import project.entity.Scooter;
import project.utils.VehicleInfo;

public class ScooterBuilder implements VehicleInfo {
    Scooter scooter = new Scooter("No", "Tresher", "1", "No", "Gedoshnik Aleksandr Vodimovich", "No", "Racing");

    public void printInfo() {
        System.out.println("Print the scooter: " + scooter.toString());
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
