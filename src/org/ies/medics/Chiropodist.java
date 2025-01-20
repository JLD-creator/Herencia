package org.ies.medics;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Chiropodist extends Medic {
    private String hospital;
    private int plant;
    Scanner scanner = new Scanner(System.in);

    public Chiropodist(String name, String surname, int numberColegial, String[] pacient, String hospital, int plant) {
        super(name, surname, numberColegial, pacient);
        this.hospital = hospital;
        this.plant = plant;
    }

    @Override
    public void showInfo() {
        System.out.println("Nombre: "+name+ ", apellidos: "+surname+", número de colegiado: "+numberColegial+" podólogo en el Hospital: "+hospital);
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

    public int getPlant() {
        return plant;
    }

    public void setPlant(int plant) {
        this.plant = plant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chiropodist that = (Chiropodist) o;
        return plant == that.plant && Objects.equals(hospital, that.hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hospital, plant);
    }

    @Override
    public String toString() {
        return "Chiropodist{" +
                "plant=" + plant +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberColegial=" + numberColegial +
                ", pacient=" + Arrays.toString(pacient) +
                '}';
    }
}
