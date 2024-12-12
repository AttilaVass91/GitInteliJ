package com.skillbrain.Ex2;
/*
Instructions
In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and
drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

The total distance it has driven, displayed as: "Driven <METERS> meters".
The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

Buy a brand-new remote controlled car
Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:

ElonsToyCar car = ElonsToyCar.buy();
2. Display the distance driven
Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:

ElonsToyCar car = ElonsToyCar.buy();
car.distanceDisplay();
// => "Driven 0 meters"
3. Display the battery percentage
Implement the ElonsToyCar.batteryDisplay() method to return the distance as displayed on the LED display:

ElonsToyCar car = ElonsToyCar.buy();
car.batteryDisplay();
// => "Battery at 100%"

Update the number of meters driven when driving
Implement the ElonsToyCar.drive() method that updates the number of meters driven:

ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.distanceDisplay();
// => "Driven 40 meters"
5. Update the battery percentage when driving
Update the ElonsToyCar.drive() method to update the battery percentage:

ElonsToyCar car = ElonsToyCar.buy();
car.drive();
car.drive();
car.batteryDisplay();
// => "Battery at 98%"
6. Prevent driving when the battery is drained
Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the
battery is drained (at 0%):

ElonsToyCar car = ElonsToyCar.buy();

// Drain the battery
// ...

car.distanceDisplay();
// => "Driven 2000 meters"

car.batteryDisplay();
// => "Battery empty"
 */
public class Main {
    public static void main(String[] args) {

        // 1. Buy a brand new remote controlled car
        ElonsToyCar car = ElonsToyCar.buy();

        // 2,3 Display intial distaance and battery status
        System.out.println(car.distanceDisplay());  // 0 metri
        System.out.println(car.batteryDisplay());   // Battery at 100 %

        // Drive the car 2 times
        car.drive();
        car.drive();

        // 4,5
        System.out.println(car.distanceDisplay());  // 40 metri
        System.out.println(car.batteryDisplay());   // Battery at 98 %

        // 6
        for (int counter = 0; counter < 100; counter++){
            car.drive();
        }

        System.out.println(car.distanceDisplay());  // 2000 metri
        System.out.println(car.batteryDisplay());   // Battery empty

        // Atempt to drive with empty battery
        car.drive();

        System.out.println(car.distanceDisplay());  // 2000 metri
        System.out.println(car.batteryDisplay());   // Battery empty
    }
}
