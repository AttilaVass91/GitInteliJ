package com.skillbrain.Ex1;

/*
Instructions
In this exercise you'll be organizing races between various types of remote controlled cars. Each car has its own speed
and battery drain characteristics.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers the car's speed
in meters and decreases the remaining battery percentage by its battery drain.

If a car's battery is below its battery drain percentage, you can't drive the car anymore.

Each race track has its own distance. Cars are tested by checking if they can finish the track without running out of
battery.

You have six tasks, each of which will work with remote controller car instances.

Creating a remote controlled car
Allow creating a remote controller car by defining a constructor for the NeedForSpeed class that takes the speed of the
car in meters and the battery drain percentage as its two parameters (both of type int):

int speed = 5;
int batteryDrain = 2;
NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
2. Creating a race track
Allow creating a race track by defining a constructor for the RaceTrack class that takes the track's distance in meters
as its sole parameter (which is of type int):

int distance = 800;
RaceTrack raceTrack = new RaceTrack(distance);
3. Drive the car
Implement the NeedForSpeed.drive() method that updates the number of meters driven based on the car's speed. Also
implement the NeedForSpeed.distanceDriven() method to return the number of meters driven by the car:

int speed = 5;
int batteryDrain = 2;
NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
car.drive();

car.distanceDriven();
// => 5
4. Check for a drained battery
Update the NeedForSpeed.drive() method to drain the battery based on the car's battery drain. Also implement the
NeedForSpeed.batteryDrained() method that indicates if the battery is drained:

int speed = 5;
int batteryDrain = 2;
NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);
car.drive();

car.batteryDrained();
// => false
5. Create the Nitro remote control car
The best-selling remote control car is the Nitro, which has a stunning top speed of 50 meters with a battery drain of
4%. Implement the (static) NeedForSpeed.nitro() method to return this type of car:

NeedForSpeed car = NeedForSpeed.nitro();
car.drive();
car.distanceDriven();
// => 50
6. Check if a remote control car can finish a race
To finish a race, a car has to be able to drive the race's distance. This means not draining its battery before having
crossed the finish line. Implement the RaceTrack.carCanFinish() method that takes a NeedForSpeed instance as its
parameter and returns true if the car can finish the race; otherwise, return false:

int speed = 5;
int batteryDrain = 2;
NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

int distance = 100;
RaceTrack race = new RaceTrack(distance);

race.carCanFinish(car);
// => true
 */

public class NeedForSpeedMain {
    public static void main(String[] args) {
        // 1. Create a car
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // 3. Drive the car
        car.drive();
        // 4. Methods for car
        System.out.println(car.distanceDriven()); // => 5
        System.out.println(car.batteryDrained()); // => false

        // 5. Create a Nitro car
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println(nitroCar.distanceDriven()); // => 50
        System.out.println(nitroCar.batteryDrained()); // => false

        // 2. Create a race track
        int distance = 100;
        RaceTrack raceTrack = new RaceTrack(distance);

        // 6. Check if a car can finish the race
        boolean canFinish = raceTrack.carCanFinish(car);
        System.out.println("Can car finish the race? " + canFinish); //true
    }
}
