package project.entity;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String type;
    private boolean defect;
    private boolean paintCondition;

    public Motorcycle(String registrationNumber, String brand, String model, String VINNumber, String owner, String drivingForce, String type, boolean defect, boolean paintCondition) {
        super(registrationNumber, brand, model, VINNumber, owner, drivingForce);
        this.type = type;
        this.defect = defect;
        this.paintCondition = paintCondition;
    }

    public String getType() {
        return type;
    }

    public boolean isDefect() {
        return defect;
    }

    public boolean isPaintCondition() {
        return paintCondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return defect == that.defect && paintCondition == that.paintCondition && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, defect, paintCondition);
    }

    @Override
    public String toString() {
        return "Motorcycle { " + "registrationNumber='" + getRegistrationNumber() + ", brand='" + getBrand() + ", model='" + getModel() + ", VINNumber='" + getVINNumber()
                + ", Owner='" + getOwner() + ", drivingForce='" + getDrivingForce() + ", Type: " + getType() + ", defect: " + isDefect()
                + ", paintCondition: " + isPaintCondition() + " }";
    }
}
