package org.ies.vehicles;
import java.util.Scanner;
import java.util.Objects;
public class Car extends Vehicle{
    private int door_number;
    private int cv;
    Scanner scanner = new Scanner(System.in);

    public Car(int km, String plate, int door_number, int cv) {
        super(km, plate);
        this.door_number = door_number;
        this.cv = cv;
    }

    public int getDoor_number() {
        return door_number;
    }

    public void setDoor_number(int door_number) {
        this.door_number = door_number;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return door_number == car.door_number && cv == car.cv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), door_number, cv);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cv=" + cv +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Cuantos kilometros mas vas a recorrer con el coche");
        int km2 = scanner.nextInt();
        km = km +km2;
        System.out.println("El coche ha recorrido "+km+ " kilometros.");
    }

    @Override
    public void showInfo() {
        System.out.println("Este vehiculo es un coche que tiene "+km+" kilometros con matricula "+plate+" con "+door_number+" puertas y tiene "+cv+ " caballos.");
    }
}
