package oop_5.presenters;

import java.util.Collection;
import java.util.GregorianCalendar;
import oop_5.models.Table;

public interface Model

{
    Collection<Table> loadTables();

    int bookTable(GregorianCalendar  bookDate, int tableNo, String name);

    int changeBooking(int oldBooking, GregorianCalendar  newDate, int tableNo, String name);
}
