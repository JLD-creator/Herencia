package org.ies.medics;

import java.util.Arrays;
import java.util.Objects;

public class Family extends Medic {
    private String centerHealthName;

    public Family(String name, String surname, int numberColegial, String[] pacient, String centerHealthName) {
        super(name, surname, numberColegial, pacient);
        this.centerHealthName = centerHealthName;
    }

    @Override
    public void showInfo() {
        System.out.println("Nombre: "+name+ ", apellidos: "+surname+", número de colegiado: "+numberColegial+" médico de familia en el centro de salud: "+centerHealthName);
    }

    public String getCenterHealthName() {
        return centerHealthName;
    }

    public void setCenterHealthName(String centerHealthName) {
        this.centerHealthName = centerHealthName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Family family = (Family) o;
        return Objects.equals(centerHealthName, family.centerHealthName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centerHealthName);
    }

    @Override
    public String toString() {
        return "Family{" +
                "centerHealthName='" + centerHealthName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberColegial=" + numberColegial +
                ", pacient=" + Arrays.toString(pacient) +
                '}';
    }
}
