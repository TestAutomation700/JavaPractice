package javaConcepts;


class Vehicle1 {
 void start() {
     System.out.println("Vehicle is starting");
 }

 void stop() {
     System.out.println("Vehicle is stopped");
 }
}

//Car Class - Inherits Vehicle
class Car1 extends Vehicle1 {
 void playMusic() {
     System.out.println("Car Music is playing");
 }
}

//Bike Class - Inherits Vehicle
class Bike1 extends Vehicle1 {
 void doStunt() {
     System.out.println("Bike Stunts");
 }
}

//Main Class
public class Inheritance_ISA {
 public static void main(String[] args) {
     // Creating Car object
     Car1 car = new Car1();
     car.start();
     car.playMusic();
     car.stop();

     // Creating Bike object
     Bike1 bike = new Bike1();
     bike.start();
     bike.doStunt();
     bike.stop();
 }
}
