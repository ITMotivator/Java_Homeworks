package oop_5.views;

import java.util.Collection;
import java.util.GregorianCalendar;
import oop_5.models.Reservation;
import oop_5.models.Table;
import oop_5.presenters.View;
import oop_5.presenters.ViewObserver;

public class BookingView implements View {

    private ViewObserver observer;

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
            if (table.getReservations().size() > 0) {
                for (Reservation booking : table.getReservations()) {
                    System.out.println("\t" + booking);
                }
            }
        }
    }

    public void bookTable(GregorianCalendar newDate, int tableNo, String name) {
        observer.onBookTable(newDate, tableNo, name);
    }

    public void changeBooking(int oldBooking, GregorianCalendar newDate, int tableNo, String name) {
        observer.onChangeBooking(oldBooking, newDate,  tableNo,  name);
    }

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void displayBookingStatus(int bookingNo) {
        if (bookingNo > 0) {
            System.out.printf("Поздравляем! Столик забронирован. Номер вашей брони: %d\n", bookingNo);
        } else {
            System.out.println("Ошибка бронирования");
        }
    }

    public void changeBookStatusView(int newBookingNo) {
        if (newBookingNo > 0) {
            System.out.printf("Ваше бронирование успешно обновлено. Новый номер брони: %d\n", newBookingNo);
        } else {
            System.out.println("Ошибка бронирования");
        }
    }

}
