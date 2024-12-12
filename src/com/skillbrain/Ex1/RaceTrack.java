package com.skillbrain.Ex1;

public class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        // Calcuulate the maximum distance the car drive
        int maxDistance = (car.battery / car.baterryDrain) * car.speed;
        return maxDistance >= this.distance;
    }
}
