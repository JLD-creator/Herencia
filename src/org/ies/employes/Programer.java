package org.ies.employes;

import java.util.Objects;

public class Programer  extends Employe{
    private String programer_languge;
    private String proyect;

    public Programer(String nif, String name, String surname, int work_hour, String programer_languge, String proyect) {
        super(nif, name, surname, work_hour);
        this.programer_languge = programer_languge;
        this.proyect = proyect;
    }

    public String getProgramer_languge() {
        return programer_languge;
    }

    public void setProgramer_languge(String programer_languge) {
        this.programer_languge = programer_languge;
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
        Programer programer = (Programer) o;
        return Objects.equals(programer_languge, programer.programer_languge) && Objects.equals(proyect, programer.proyect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programer_languge, proyect);
    }

    @Override
    public String toString() {
        return "Programer{" +
                "proyect='" + proyect + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work_hour=" + work_hour +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("Soy un programdor que tengo el NIF: "+nif+" mi nombre es "+name+" y mis apellidos: "+surname+" trabajo "+work_hour+" en "+programer_languge+" en el proyecto"+proyect+" .");
    }
}