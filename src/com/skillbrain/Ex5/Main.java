package com.skillbrain.Ex5;
/*
Instructions
You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

Check what the counts were last week
For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
2. Check how many birds visited today
Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
3. Increment today's count
Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
4. Check if there was a day with no visiting birds
Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
5. Calculate the number of visiting birds for the first number of days
Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
6. Calculate the number of busy days
Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2
 */
public class Main {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        // Task 1
        System.out.println(java.util.Arrays.toString(BirdWatcher.getLastWeek())); // => [0, 2, 5, 3, 7, 8, 4]

        // Task 2
        System.out.println(birdCount.getToday()); // => 1

        // Task 3
        birdCount.incrementTodaysCount();
        System.out.println(birdCount.getToday()); // => 2

        // Task 4
        System.out.println(birdCount.hasDayWithoutBirds()); // => true

        // Task 5
        System.out.println(birdCount.getCountForFirstDays(4)); // => 14

        // Task 6
        System.out.println(birdCount.getBusyDays()); // => 2
    }
}

