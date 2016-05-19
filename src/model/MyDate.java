package model;

/**
 * Created by wookie on 5/17/16.
 */
public class MyDate implements Cloneable {
    private final static int MAX_DAYS = 365;
    private final static int MAX_MONTH = 12;

    private int day;
    private int month;
    private int year;

    public MyDate() {

    }

    public MyDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    /**
     * Increase day for 1. If day become more then value MAX_DAYS(465), also increasing month.
     * If month become more then value MAX_MONTH(12), also increasing year.
     */
    public void increase() {
        day++;
        if(day > MAX_DAYS) {
            month++;
            day = 1;

            if(month > MAX_MONTH) {
                month = 1;
                year++;
            }
        }
    }

    /**
     * Decrease day for 1. Day can't become less then 1.
     */
    public void decrease() {
        if(day > 1)
            day--;
    }

    @Override
    public MyDate clone() {
        try {
            return (MyDate)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (getYear() != myDate.getYear()) return false;
        if (getMonth() != myDate.getMonth()) return false;
        return getDay() == myDate.getDay();

    }

    @Override
    public int hashCode() {
        int result = getYear();
        result = 31 * result + getMonth();
        result = 31 * result + getDay();
        return result;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    /**
     * Setter for field "month".
     * @param month integer value. Should be from 1 to MAX_MONTH(12).
     */
    public void setMonth(int month) {
        if((month <= MAX_MONTH) && (month > 0))
            this.month = month;
    }

    public int getDay() {
            return day;
    }

    /**
     * Setter for field "day".
     * @param day integer value. Should be from 1 to MAX_DAYS(365).
     */
    public void setDay(int day) {
        if((day <= MAX_DAYS) && (day > 0))
            this.day = day;
    }
}
