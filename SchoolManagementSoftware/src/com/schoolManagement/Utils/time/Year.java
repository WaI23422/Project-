package com.schoolManagement.Utils.time;

import java.util.Calendar;

public class Year {
    private int YEAR = 2000;

    // Constructor:
    public Year() {}
    public Year(int YEAR) {
        setYEAR(YEAR);
    }
    
    // Getter and Setter:
    public int getYEAR() { return YEAR; }
    public void setYEAR(int YEAR) {
        if (isValidYear(YEAR)) {
            this.YEAR = YEAR;
        } else {
            throw new IllegalArgumentException("Error: The entered year value is outside the valid range (0-now). Please choose a valid year for extension.");
        }
    }

    public static boolean isLeapYear(int YEAR) {
        boolean cond = false;
 
        if (YEAR % 4 == 0) {
            cond = true;
            if (YEAR % 100 == 0) {
                if (YEAR % 400 == 0) { cond = true; }
                else { cond = false; }
            }
        } else { cond = false; }
        
        return cond;
    }   

    public boolean isValidYear(int YEAR) {
        if (YEAR > 0 && YEAR < Calendar.getInstance().get(Calendar.YEAR)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(YEAR);
    }
}
