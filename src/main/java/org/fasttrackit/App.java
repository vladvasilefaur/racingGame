package org.fasttrackit;


import org.fasttrackit.cheater.UFO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";
        firstEngine.capacity = 1500;


        Car firstCar = new Car(firstEngine);
        firstCar.setName("Dacia");
        firstCar.doorCount = 4;
        firstCar.setColor("black");
        firstCar.running = true;
        firstCar.setMileage(7.5);

        System.out.println(firstCar.toString());


//
//        System.out.println(firstCar.getName());
//
//        firstCar.engine = firstEngine;
//        firstEngine.expiryDate = LocalDateTime.now();
//
//
//        double firstCarTraveledDistance = firstCar.accelerate(130, 2);
//
//
//
//
//
//
//        Engine secondEngine = new Engine();
//        secondEngine.manufacturer = "BMW";
//        secondEngine.capacity = 4000;
//
//
//       Car secondCar= new Car(secondEngine);
//       secondCar.setName("BMW");
//       secondCar.doorCount = 4;
//       secondCar.setColor("red");
//       secondCar.running = true;
//       secondCar.setMileage(9.5);
//
//
//       secondCar.engine = secondEngine;

//      Example of static variables unique for the whole application

        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount++;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;
        Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle 1: " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2: " + vehicle2.vehicleCount);
        System.out.println("Value from Vehicle class: " + Vehicle.vehicleCount);

        new AutoVehicle();

        new  AutoVehicle(new Engine());

        vehicle1.accelerate(34, 12);


        new UFO().accelerate(100,2);











    }
}
