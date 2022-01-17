package project.entity;

import java.util.Objects;

public class Bicycle extends Vehicle {
    private String type;

    public Bicycle(String registrationNumber, String brand, String model, String VINNumber, String owner, String drivingForce, String type) {
        super(registrationNumber, brand, model, VINNumber, owner, drivingForce);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bicycle bicycle = (Bicycle) o;
        return Objects.equals(type, bicycle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Bicycle { " + "registrationNumber='" + getRegistrationNumber() + ", brand='" + getBrand() + ", model='" + getModel() + ", VINNumber='" + getVINNumber()
                + ", Owner='" + getOwner() + ", drivingForce='" + getDrivingForce() + ", Type: " + getType() + '}';
    }
}
