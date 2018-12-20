package org.fasttrackit;


import java.time.LocalDateTime;

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
        firstCar.name = "Dacia";
        firstCar.doorCount = 4;
        firstCar.color = "black";
        firstCar.running = true;
        firstCar.mileage = 7.5;

        firstCar.engine = firstEngine;
        firstEngine.expiryDate = LocalDateTime.now();


        double firstCarTraveledDistance = firstCar.accelerate(130, 2);






        Engine secondEngine = new Engine();
        secondEngine.manufacturer = "BMW";
        secondEngine.capacity = 4000;


       Car secondCar= new Car(secondEngine);
       secondCar.name = "BMW";
       secondCar.doorCount = 4;
       secondCar.color = "red";
       secondCar.running = true;
       secondCar.mileage = 9.5;

       secondCar.engine = secondEngine;










    }
}
