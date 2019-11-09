package model;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Day> days;
    private int runningTotalCO2;

    public Person(int lengthOfChallenge) {
        days = new ArrayList<Day>(lengthOfChallenge);
    }

    public int calcRunningTotalCO2() {
        int totalCO2 = 0;

        for (Day day : days) {
            totalCO2 += 1;
        }
        return 1;
    }
}