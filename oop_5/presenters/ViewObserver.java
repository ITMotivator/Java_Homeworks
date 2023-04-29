package oop_5.presenters;

import java.util.GregorianCalendar;

public interface ViewObserver {

    void onBookTable(GregorianCalendar orderDate, int tableNo, String name);

    void onChangeBooking(int oldBooking, GregorianCalendar newDate, int tableNo, String name);
}
