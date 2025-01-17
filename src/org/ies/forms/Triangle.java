package org.ies.forms;
import java.util.Objects;

public class Triangle extends Form{
    private double base;
    private double high;

    public Triangle(String color, double base, double high) {
        super(color);
        this.base = base;
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(high, triangle.high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, high);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", high=" + high +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void area() {
        double area = (base * high) / 2;
        System.out.println("El area del triangulo es "+area);
    }

    @Override
    public void showInfo() {
        System.out.println("Es un triangulo de "+base+" cm de base y una altura de "+high+" cm y de color "+color);
    }
}
