package org.ies.medics;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Surgeon extends Medic{
    private String hospital;
    private int numberBox;
    Scanner scanner = new Scanner(System.in);

    public Surgeon(String name, String surname, int numberColegial, String[] pacient, String hospital, int numberBox) {
        super(name, surname, numberColegial, pacient);
        this.hospital = hospital;
        this.numberBox = numberBox;
    }

    @Override
    public void showInfo() {
        System.out.println("Nombre: "+name+ ", apellidos: "+surname+ " ,número de colegiado: "+numberColegial+", cirujano del box "+numberBox+" del hospital "+hospital);
    }
    public boolean workHospital(){
        System.out.println("Introduce un Hospital");
        String hospital2 = scanner.nextLine();
        if (hospital2.equals(hospital)){
            return true;
        }
        return false;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumberBox() {
        return numberBox;
    }

    public void setNumberBox(int numberBox) {
        this.numberBox = numberBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Surgeon surgeon = (Surgeon) o;
        return numberBox == surgeon.numberBox && Objects.equals(hospital, surgeon.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, numberBox);
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "numberBox=" + numberBox +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberColegial=" + numberColegial +
                ", pacient=" + Arrays.toString(pacient) +
                '}';
    }
}
