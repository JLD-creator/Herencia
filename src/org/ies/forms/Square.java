package org.ies.forms;
import java.util.Objects;

public class Square extends Form{
    private double size;

    public Square(String color, double size) {
        super(color);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(size, square.size) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void area() {
        double area = size * size;
        System.out.println("El area del cuadrado es "+area);
    }

    @Override
    public void showInfo() {
        System.out.println("Es un cuadrado de "+size+" cm de lado y de color "+color);
    }
}
