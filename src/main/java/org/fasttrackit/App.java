package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new Car();

        Car firstCar = new Car();
        firstCar.name = "Dacia";
        firstCar.doorCount = 4;
        firstCar.color = "black";
        firstCar.running = true;
        firstCar.mileage = 7.5;


        new Engine();

       Engine firstEngine = new Engine();
       firstEngine.manufacturer = "Renault";
       firstEngine.capacity = 1500;

       firstCar.engine = firstEngine;


       Car secondCar= new Car();
       secondCar.name = "BMW";
       secondCar.doorCount = 4;
       secondCar.color = "red";
       secondCar.running = true;
       secondCar.mileage = 9.5;

       Engine secondEngine = new Engine;
       secondEngine.manufacturer = "BMW";
       secondEngine.capacity = 4000;

       secondCar.engine = secondCar;







    }
}
