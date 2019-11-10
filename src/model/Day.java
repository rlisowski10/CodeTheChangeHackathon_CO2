package model;

class Day implements IModeCO2 {

    private int dayNum;
    private int km;
    private String mode;
    private int dayCO2;

    public Day(int dayNum, int km, String mode) {
        this.dayNum = dayNum;
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

    public int getDayCO2() {
        return this.dayCO2;
    }

    public String toString() {
        return "Day " + this.dayNum + " | km: " + this.km + " | mode: " + this.mode
        + "| Total daily CO2 (kg): " + this.dayCO2;
    }

}