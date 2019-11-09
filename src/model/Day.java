package model;

public class Day implements IModeCO2 {

    private int km;
    private String mode;
    private int dayCO2;

    public Day(int km, String mode) {
        this.km = km;
        this.mode = mode;
        this.dayCO2 = calcDayC02(); //get CO2
    }
    
    private int getModeCO2() {
        if(mode.equals("car")) {
            return carCO2;
        } else if (mode.equals("bus")) {
            return busCO2;
        } else if (mode.equals("train")) {
            return trainCO2;
        }
        return 0;
    }

    private int calcDayC02() {
        return this.km * getModeCO2();
    }

}