package project.entity;

import java.util.Objects;

public abstract class Vehicle {
    private String registrationNumber;
    private String brand;
    private String model;
    private String VINNumber;
    private String Owner;
    private String drivingForce;

    public Vehicle(String registrationNumber, String brand, String model, String VINNumber, String owner, String drivingForce) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.VINNumber = VINNumber;
        Owner = owner;
        this.drivingForce = drivingForce;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVINNumber() {
        return VINNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public String getDrivingForce() {
        return drivingForce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(registrationNumber, vehicle.registrationNumber) && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(VINNumber, vehicle.VINNumber) && Objects.equals(Owner, vehicle.Owner) && Objects.equals(drivingForce, vehicle.drivingForce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, brand, model, VINNumber, Owner, drivingForce);
    }

    @Override
    public String toString() {
        return "Vehicle { " + "registrationNumber='" + registrationNumber + ", brand='" + brand +  ", model='" + model + ", VINNumber='" + VINNumber +  ", Owner='" + Owner + ", drivingForce='" + drivingForce + '}';
    }
}
