package com.skillbrain.Ex2;

public class ElonsToyCar {

    // paramateri
    private int distanceDriven;
    private int baterryPercentage;

    public ElonsToyCar() {
        this.distanceDriven = 0;
        this.baterryPercentage = 100;
    }

    // 1. buy a brand new remote controlled car
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // 2. Display the distance driven
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    // 3. Display the battery precentage
    public String batteryDisplay(){
        if (baterryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + baterryPercentage + "%";
    }

    // 4,5,6
    public void drive() {
        if (baterryPercentage > 0) {
            distanceDriven += 20; // Car covers 20 meters per drive
            baterryPercentage = baterryPercentage - 1; // Car consume 1% Battery per drive
        }
    }
}
