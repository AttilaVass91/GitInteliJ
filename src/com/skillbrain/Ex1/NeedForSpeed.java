package com.skillbrain.Ex1;

public class NeedForSpeed {
    // Parameters
    public int speed;
    public int baterryDrain;
    public int battery;
    public int meterDriven;

    //Constructor
    public NeedForSpeed(int speed, int baterryDrain) {
        this.baterryDrain = baterryDrain;
        this.speed = speed;
        this.battery = 100; // Start with full battery
        this.meterDriven = 0;
    }

    //Car drive
    public void drive() {
        if (this.battery >= this.baterryDrain) {
            this.meterDriven += this.speed;
            this.battery -= this.baterryDrain;
        }
    }

    // Get distance driven
    public int distanceDriven() {
        return this.meterDriven;
    }


    public boolean batteryDrained() {
//        System.out.println("Battery: " + this.battery);
//        System.out.println("BatteryDrain: " + this.baterryDrain);
        return this.battery < this.baterryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
