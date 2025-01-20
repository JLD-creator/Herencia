package org.ies.employes;

import java.util.Objects;

abstract class Employe {
    protected String nif;
    protected String name;
    protected String surname;
    protected int work_hour;

    public Employe(String nif, String name, String surname, int work_hour) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.work_hour = work_hour;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

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

    public int getWork_hour() {
        return work_hour;
    }

    public void setWork_hour(int work_hour) {
        this.work_hour = work_hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return work_hour == employe.work_hour && Objects.equals(nif, employe.nif) && Objects.equals(name, employe.name) && Objects.equals(surname, employe.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, work_hour);
    }

public abstract void showInfo();
    public void move(int work_extra) {
        work_hour += work_extra;
        System.out.println("Horas  " + work_hour + " trabajadas ");
    }
}
