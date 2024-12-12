package com.skillbrain.Ex5;

public class BirdWatcher {

    private int[] birdsPerDay;

    // Constructor
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // Task 1: Get last week's counts
    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    // Task 2: Get today's count
    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0; // In case no data is available
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // Task 3: Increment today's count
    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    // Task 4: Check if there was a day with no visiting birds
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    // Task 5: Calculate the number of visiting birds for the first number of days
    public int getCountForFirstDays(int days) {
        int sum = 0;
        for (int i = 0; i < days && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    // Task 6: Calculate the number of busy days
    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}

