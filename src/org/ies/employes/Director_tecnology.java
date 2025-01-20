package org.ies.employes;

public class Director_tecnology extends Employe{
    public Director_tecnology(String nif, String name, String surname, int work_hour) {
        super(nif, name, surname, work_hour);
    }
    @Override
    public void showInfo() {
        System.out.println("Soy directorn de tecnología y mi NIF es: "+nif+" mi nombre es "+name+ " y mis apellidos son: "+surname+" y trabajo "+work_hour+" horas.");
    }

    @Override
    public void move(int work_extra) {
        super.move(work_extra);
    }

    @Override
    public String toString() {
        return "Director_tecnology{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work_hour=" + work_hour +
                '}';
    }


}
