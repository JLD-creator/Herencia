package org.ies.forms;
import java.util.Objects;

abstract class Form {
    protected String color;

    public Form(String color) {
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
        Form form = (Form) o;
        return Objects.equals(color, form.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    public abstract void area();
    public abstract void showInfo();
}
