package com.schoolManagement.Utils.time;

public class Day {
    private int DAY = 1;

    // Constructor:
    public Day() {}
    public Day(int DAY) {
        setDAY(DAY);
    }

    // Getter and Setter:
    public int getDAY() { return DAY; }
    public void setDAY(int DAY) { 
        if (DAY > 0 && DAY < 32) {
            this.DAY = DAY; 
        } else {
            throw new IllegalArgumentException("Error: The entered day value is outside the valid range (1-31). Please choose a valid day for extension.");
        }
    }

    public boolean isValidDay(int DAY, int MONTH, int YEAR){
        if (DAY < 0 || DAY > 32) {return false;}

        if (MONTH == 2) {
            boolean leapYear = Year.isLeapYear(YEAR);
            if (leapYear && DAY > 29) { return false; } 
            if (!leapYear && DAY > 28) { return false; }
        }

        if (
            ( MONTH == 3 ||
            MONTH == 5 ||
            MONTH == 9 ||
            MONTH == 11 ) &&
            DAY > 30
        ) { return false; }

        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(DAY);
    }    
}
