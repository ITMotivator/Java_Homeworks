package oop_5.presenters;

import java.util.Collection;
import java.util.GregorianCalendar;
import oop_5.models.Table;

public class BookingPresenter implements ViewObserver {

    private final Model tModel;
    private final View tView;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view) {
        this.tModel = model;
        this.tView = view;
        this.tView.setObserver(this);
    }

    public void loadTables() {
        if (tables == null) {
            tables = tModel.loadTables();
        }
    }

    public void updateView() {
        this.tView.showTables(tables);
    }

    private void updBookStatusView(int bookingNo) {
        this.tView.displayBookingStatus(bookingNo);
    }

    private void changeBookStatusView(int newBookingNo) {
        this.tView.changeBookStatusView(newBookingNo);
    }

    @Override
    public void onBookTable(GregorianCalendar  orderDate, int tableNo, String name) {
        int bookingNo = tModel.bookTable(orderDate, tableNo, name);
        if (bookingNo > 0) {
            updBookStatusView(bookingNo);
        }
    }

    @Override
    public void onChangeBooking(int oldBooking, GregorianCalendar  newDate, int tableNo, String name) {
        int newBookingNo = tModel.changeBooking(oldBooking, newDate, tableNo, name);
        if (newBookingNo > 0) {
            changeBookStatusView(newBookingNo);
        }
    }

}
