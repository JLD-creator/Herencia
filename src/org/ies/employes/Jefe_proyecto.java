package org.ies.employes;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Jefe_proyecto extends Employe {
    private String[] proyect;
    Scanner scanner = new Scanner(System.in);

    public Jefe_proyecto(String nif, String name, String surname, int work_hour, String[] proyect) {
        super(nif, name, surname, work_hour);
        this.proyect = proyect;
    }
    @Override
    public void showInfo() {
        System.out.println("Soy el jefe de proyecto: " + proyect + " mi NIF es " + nif + " y mi nombre es " + name + " con apellidos " + surname + " y trabajo " + work_hour + " horas.");
    }

    @Override
    public void move(int work_extra) {
        super.move(work_extra);
    }

    protected boolean boosProyect() {
        System.out.println("Introduce el nombre de un proyecto");
        String proyect2 = scanner.nextLine();
        if (proyect2.equals(proyect)){
            return true;
        }
        return false;
    }

    public String[] getProyect() {
        return proyect;
    }

    public void setProyect(String[] proyect) {
        this.proyect = proyect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jefe_proyecto that = (Jefe_proyecto) o;
        return Objects.deepEquals(proyect, that.proyect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(proyect));
    }

    @Override
    public String toString() {
        return "Jefe_proyecto{" +
                "proyect=" + Arrays.toString(proyect) +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work_hour=" + work_hour +
                '}';
    }


}
