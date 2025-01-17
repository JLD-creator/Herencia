package org.ies.animals;

public class Main_Animals {
        public static void main(String[] args) {
            Pig pig = new Pig(5, "Bellotas");
            Cat cat = new Cat(8, "Blanco");
            Dog dog = new Dog(1, "Bulldog");
            pig.talk();
            cat.talk();
            dog.talk();
            dog.showInfo();
            cat.showInfo();
            pig.showInfo();
        }
    }

