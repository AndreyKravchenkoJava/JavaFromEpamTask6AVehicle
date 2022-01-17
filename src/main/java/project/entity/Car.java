package project.entity;

import java.util.Objects;

public class Car extends Vehicle {
    private int HorsePower;
    private boolean defect;
    private boolean tankCondition;

    public Car(String registrationNumber, String brand, String model, String VINNumber, String owner, String drivingForce, int horsePower, boolean defect, boolean tankCondition) {
        super(registrationNumber, brand, model, VINNumber, owner, drivingForce);
        this.HorsePower = horsePower;
        this.defect = defect;
        this.tankCondition = tankCondition;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public boolean isDefect() {
        return defect;
    }

    public boolean isTankCondition() {
        return tankCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return HorsePower == car.HorsePower && defect == car.defect && tankCondition == car.tankCondition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), HorsePower, defect, tankCondition);
    }

    @Override
    public String toString() {
        return "Car { " + "registrationNumber='" + getRegistrationNumber() + ", brand='" + getBrand() + ", model='" + getModel() + ", VINNumber='" + getVINNumber()
                + ", Owner='" + getOwner() + ", drivingForce='" + getDrivingForce() + ", horsePower: " + getHorsePower() + ", defect: " + isDefect()
                + ", tankCondition: " + isTankCondition() + " }";
    }
}
