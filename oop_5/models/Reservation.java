package oop_5.models;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reservation {

    private final int resId;
    private static int resCounter = 1000;
    private GregorianCalendar date;
    private String clientName;

    {
        this.resId = ++resCounter;
    }

    public Reservation(GregorianCalendar  bookDate, String name) {
        this.date = bookDate;
        this.clientName = name;
    }

    public String getClientName() {
        return this.clientName;
    }

    public int getResId() {
        return this.resId;
    }

    public GregorianCalendar getResDate() {
        return this.date;
    }

    private String dateToString() {
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH) + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int hours = date.get(Calendar.HOUR);
        int minutes = date.get(Calendar.MINUTE);
        return String.format("%d:%d %d.%d.%d", hours, minutes, day, month, year);
    }

    @Override
    public String toString() {
        return resId + " " + " " + this.dateToString() + " " + clientName;
    }

}
