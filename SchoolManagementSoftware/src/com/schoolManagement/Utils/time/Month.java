package com.schoolManagement.Utils.time;

public class Month {
    private int MONTH = 1;

    // Constructor:
    public Month() {}
    public Month(int MONTH) {
        setMONTH(MONTH);
    }

    // Getter and Setter:
    public int getMONTH() { return MONTH; }
    public void setMONTH(int MONTH) {
        if (isValidMonth(MONTH)) {
            this.MONTH = MONTH;
        } else {
            throw new IllegalArgumentException("Error: The entered month value is outside the valid range (1-12). Please choose a valid month for extension.");
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(MONTH);
    }
    
    public boolean isValidMonth(int MONTH) {
        if (MONTH > 0 && MONTH < 13) { return true; }

        return false;
    }
}
