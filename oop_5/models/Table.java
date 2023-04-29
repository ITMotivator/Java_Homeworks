package oop_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter;
    private final int tNumber;
    private final Collection<Reservation> reservations = new ArrayList<>();

    {
        this.tNumber = ++counter;
    }

    public int getTableNumber() {
        return this.tNumber;
    }

    public Collection<Reservation> getReservations() {
        return this.reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик %d броней: %d ", this.tNumber, this.reservations.size());
    }
}
