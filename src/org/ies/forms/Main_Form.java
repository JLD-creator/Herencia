package org.ies.forms;

public class Main_Form {
    public static void main(String[] args) {
        Square square = new Square("Azul", 14.45);
        Circle circle = new Circle("Amarillo", 8.75);
        Triangle triangle = new Triangle("Rosa", 10, 23.56);
        square.area();
        square.showInfo();
        circle.area();
        circle.showInfo();
        triangle.area();
        triangle.showInfo();
    }
}
