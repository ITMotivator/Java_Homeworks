package oop_5.presenters;

import java.util.Collection;
import oop_5.models.Table;

public interface View {

    void showTables(Collection<Table> tables);

    void setObserver(ViewObserver observer);

    void displayBookingStatus(int oldBooking);

    void changeBookStatusView(int newBookingNo);
}
