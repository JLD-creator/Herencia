package org.ies.animals;
import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk() {
        System.out.println("MIUA, MIUA");

    }

    @Override
    public void showInfo() {
        System.out.println("Este animal es un gato de color: "+color+" que tiene: "+age+ " años");
    }
}

