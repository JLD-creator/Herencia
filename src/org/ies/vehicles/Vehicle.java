package org.ies.vehicles;
import java.util.Objects;

abstract class Vehicle {
    protected int km;
    protected String plate;

    public Vehicle(int km, String plate) {
        this.km = km;
        this.plate = plate;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return km == vehicle.km && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(km, plate);
    }
    public abstract void move();
    public abstract void  showInfo();
}
