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


        Car firstCar = new Car();
        firstCar.name = "Dacia";
        firstCar.doorCount = 4;
        firstCar.color = "black";
        firstCar.running = true;
        firstCar.mileage = 7.5;


        double firstCarTraveledDistance = firstCar.accelerate(130, 2);







       Engine firstEngine = new Engine();
       firstEngine.manufacturer = "Renault";
       firstEngine.capacity = 1500;

       firstCar.engine = firstEngine;
       firstEngine.expiryDate = LocalDateTime.now();





       Car secondCar= new Car();
       secondCar.name = "BMW";
       secondCar.doorCount = 4;
       secondCar.color = "red";
       secondCar.running = true;
       secondCar.mileage = 9.5;


       Engine secondEngine = new Engine();
       secondEngine.manufacturer = "BMW";
       secondEngine.capacity = 4000;

       secondCar.engine = secondEngine;










    }
}
