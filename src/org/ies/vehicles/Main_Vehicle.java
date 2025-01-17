package org.ies.vehicles;

public class Main_Vehicle {
    public static void main(String[] args) {
        Truck truck = new Truck(450, "4586KLO", 2);
        Car car = new Car(1230, "8964UYT", 5, 130);
        MotorBike motorBike = new MotorBike(200, "1597ÑJH", 230);
        truck.move();
        car.move();
        motorBike.move();
        truck.showInfo();
        car.showInfo();
        motorBike.showInfo();
    }
}

