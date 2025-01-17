package org.ies.animals;
import java.util.Objects;

public class Pig extends Animal {
    private String food;

    public Pig(int age, String food) {
        super(age);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pig pig = (Pig) o;
        return Objects.equals(food, pig.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "food='" + food + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("OINK, OINK");
    }

    @Override
    public void showInfo() {
        System.out.println("Este animal es un cerdo que se alimenta de "+food+" y tiene "+age+" años.");
    }
}

