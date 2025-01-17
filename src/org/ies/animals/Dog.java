package org.ies.animals;
import java.util.Objects;

public class Dog extends Animal{
    private String race;

    public Dog(int age, String race) {
        super(age);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(race, dog.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), race);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "race='" + race + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("gua, gua");
    }

    @Override
    public void showInfo() {
        System.out.println("Este animal es un perro de raza: "+race+ " que tiene una edad: "+age+ " años.");
    }
}

