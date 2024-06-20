package com.schoolManagement.Utils.time;

public class Date {
    private Day DAY = new Day();
    private Month MONTH = new Month();
    private Year YEAR = new Year();

    // Constructor:
    public Date() {}
    public Date(int DAY, int MONTH, int YEAR) {
        if (
            this.DAY.isValidDay(DAY, MONTH, YEAR)
        ) {
            this.DAY = new Day(DAY);
            this.MONTH = new Month(MONTH);
            this.YEAR = new Year(YEAR);
        } else {
            throw new IllegalArgumentException("Error: The entered date value is outside the valid range. Please choose a valid date for extension.");
        }
    }

    @Override
    public String toString() {
        return DAY.toString() + "/" + MONTH.toString() + "/" + YEAR.toString();
    }
}