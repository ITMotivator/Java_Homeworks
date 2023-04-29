package oop_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import oop_5.presenters.Model;

public class TableModel implements Model {
    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                tables.add(new Table());
            }
        }
        return tables;
    }

    public int bookTable(GregorianCalendar bookDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNo) {
                Reservation booking = new Reservation(bookDate, name);
                table.getReservations().add(booking);
                return booking.getResId();
            }
        }
        return -1;

    }

    @Override
    public int changeBooking(int oldBooking, GregorianCalendar  newDate, int tableNo, String name) {
        boolean remove = false;
        for (Table table : tables) {
            for (Reservation booking : table.getReservations()) {
                if (booking.getResId() == oldBooking) {
                    remove = table.getReservations().remove(booking);
                    break;
                }
            }
            if (remove) {
                return this.bookTable(newDate, tableNo, name); 
            } else {
                System.err.println("Ошибка обновления бронирования");}
        }
        return -1;
    }
}
