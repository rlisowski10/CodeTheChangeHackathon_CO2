package model;

import java.util.ArrayList;

class Person implements Comparable<Person> {
    private String name;
    private ArrayList<Day> days;
    private int runningTotalCO2 = 0;
    private String challengeCode;

    public Person(String name, String challengeCode) {
        days = new ArrayList<Day>();
        this.name = name;
        this.challengeCode = challengeCode;
    }

    public String getName() {
        return name;
    }

    public int getrunningTotalCO2() {
        return runningTotalCO2;
    }

    public void calcRunningTotalCO2() {
        runningTotalCO2 = 0;
        for (Day day : days) {
            runningTotalCO2 += day.getDayCO2();
        }
    }

    public void addDay(int dayNum, int km, String mode) {
        Day day = new Day(dayNum, km, mode);
        days.add(day);
        calcRunningTotalCO2();
    }

    public String getPersonDailyStats() {
        String personDailyStats = "";

        for (Day day : days) {
            personDailyStats += day.toString() + "\n";
        }

        return personDailyStats;
    }

    public String toString() {
        String personStringRepresentation = "Name: " + this.name + "\nCumulative CO2: " + runningTotalCO2 + "\n";

        for (Day day : days) {
            personStringRepresentation += day.toString() + "\n";
        }

        return personStringRepresentation;
    }
}