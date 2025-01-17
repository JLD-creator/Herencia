package org.ies.vehicles;
import java.util.Objects;
import java.util.Scanner;

public class MotorBike extends Vehicle{
    private int cv;
    Scanner scanner = new Scanner(System.in);

    public MotorBike(int km, String plate, int cv) {
        super(km, plate);
        this.cv = cv;
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
        MotorBike motorBike = (MotorBike) o;
        return cv == motorBike.cv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cv);
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "cv=" + cv +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Cuantos kilometros mas vas a recorrer con la moto");
        int km2 = scanner.nextInt();
        km = km +km2;
        System.out.println("La moto ha recorrido "+km+" kilometros.");
    }

    @Override
    public void showInfo() {
        System.out.println("Este vehiculo es una moto que tiene "+km+ " kilometros con matricula "+plate+" y tiene "+cv+" caballos.");
    }

}
