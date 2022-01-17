package project.entity;

import java.util.Objects;

public class ATV extends Vehicle {
    private String type;

    public ATV(String registrationNumber, String brand, String model, String VINNumber, String owner, String drivingForce, String type) {
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
        ATV atv = (ATV) o;
        return Objects.equals(type, atv.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "ATV { " + "registrationNumber='" + getRegistrationNumber() + ", brand='" + getBrand() + ", model='" + getModel() + ", VINNumber='" + getVINNumber()
                + ", Owner='" + getOwner() + ", drivingForce='" + getDrivingForce() + ", Type: " + getType() + '}';
    }
}
