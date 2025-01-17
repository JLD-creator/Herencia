package org.ies.vehicles;
import java.util.Objects;
import java.util.Scanner;

public class Truck  extends Vehicle{
    private int number_eje;
    Scanner scanner = new Scanner(System.in);

    public Truck(int km, String plate, int number_eje) {
        super(km, plate);
        this.number_eje = number_eje;
    }

    public int getNumber_eje() {
        return number_eje;
    }

    public void setNumber_eje(int number_eje) {
        this.number_eje = number_eje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return number_eje == truck.number_eje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number_eje);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "number_eje=" + number_eje +
                ", km=" + km +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Cuantos kilometros mas vas a recorrer con el camion");
        int km2 = scanner.nextInt();
        km = km +km2;
        System.out.println("El camion ha recorrido "+km+" kilometros.");
    }

    @Override
    public void showInfo() {
        System.out.println("El vehiculo es un camion con "+km+" con matricula "+plate+ " y tiene "+number_eje+ " ejes.");
    }
}
