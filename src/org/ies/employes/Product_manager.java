package org.ies.employes;

import java.util.Objects;

public class Product_manager extends Employe{
    private String proyect;

    public Product_manager(String nif, String name, String surname, int work_hour, String proyect) {
        super(nif, name, surname, work_hour);
        this.proyect = proyect;
    }

    public String getProyect() {
        return proyect;
    }

    public void setProyect(String proyect) {
        this.proyect = proyect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product_manager that = (Product_manager) o;
        return Objects.equals(proyect, that.proyect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), proyect);
    }

    @Override
    public String toString() {
        return "Product_manager{" +
                "proyect='" + proyect + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work_hour=" + work_hour +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Soy un Manager productor y mi NIF es: "+nif+" mi nombre es "+name+ " y mis apellidos son: "+surname+" trabajo en el proyecto "+proyect+" "+work_hour+" horas.");
    }
}
