package oop_6.dip;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private IPrint printer;
    private List<ReportItem> items; // Отчетные данные

    public Report(IPrint printer) {
        this.printer = printer;
    }

    // расчет отчетных данных
    public void calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output() {

        if (printer != null) {
            printer.print(items);
        }
    }

}
