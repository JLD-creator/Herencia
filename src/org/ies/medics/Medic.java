package org.ies.medics;

import java.util.Arrays;
import java.util.Objects;

abstract class Medic {
    protected String name;
    protected String surname;
    protected int numberColegial;
    protected String[] pacient;

    public Medic(String name, String surname, int numberColegial, String[] pacient) {
        this.name = name;
        this.surname = surname;
        this.numberColegial = numberColegial;
        this.pacient = pacient;
    }
    public abstract void showInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberColegial() {
        return numberColegial;
    }

    public void setNumberColegial(int numberColegial) {
        this.numberColegial = numberColegial;
    }

    public String[] getPacient() {
        return pacient;
    }

    public void setPacient(String[] pacient) {
        this.pacient = pacient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medic medic = (Medic) o;
        return numberColegial == medic.numberColegial && Objects.equals(name, medic.name) && Objects.equals(surname, medic.surname) && Objects.deepEquals(pacient, medic.pacient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, numberColegial, Arrays.hashCode(pacient));
    }
}
