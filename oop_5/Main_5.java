package oop_5;

import java.util.GregorianCalendar;
import oop_5.models.TableModel;
import oop_5.presenters.BookingPresenter;
import oop_5.views.BookingView;

public class Main_5 {
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        bookingView.bookTable(new GregorianCalendar(), 1, "Иван");
        bookingPresenter.updateView();
        bookingView.changeBooking(1001, new GregorianCalendar(), 2, "Сергей");
        bookingPresenter.updateView();
    }

}
