package org.ies.employes;

import java.util.Objects;
import java.util.Scanner;

public class Programer extends Employe {
    private String programer_language;
    private String proyect;
    Scanner scanner = new Scanner(System.in);

    public Programer(String nif, String name, String surname, int work_hour, String programer_language, String proyect) {
        super(nif, name, surname, work_hour);
        this.programer_language = programer_language;
        this.proyect = proyect;
    }

    @Override
    public void showInfo() {
        System.out.println("Soy un programdor que tengo el NIF: " + nif + " mi nombre es " + name + " y mis apellidos: " + surname + " trabajo " + work_hour + " en " + programer_language + " en el proyecto" + proyect + " .");
    }

    @Override
    public void move(int work_extra) {
        super.move(work_extra);
    }

    protected boolean language_programer() {
        System.out.println("Introduce un lenguaje de programacion");
        String programerLanguage = scanner.nextLine();
        if (programerLanguage.equals(programer_language)) {
            return true;
        } else {
            return false;
        }

    }

    public String getProgramer_language() {
        return programer_language;
    }

    public void setProgramer_language(String programer_language) {
        this.programer_language = programer_language;
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
        return Objects.equals(programer_language, programer.programer_language) && Objects.equals(proyect, programer.proyect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), programer_language, proyect);
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


}