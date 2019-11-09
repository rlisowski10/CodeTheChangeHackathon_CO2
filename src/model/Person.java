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
        int tempSum = 0;

        for (Day d : days) {

        }
        return 1;
    }
}