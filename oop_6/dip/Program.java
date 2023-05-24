package oop_6.dip;

public class Program {

    //TODO: (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {
        PrintReport printer1 = new PrintReport();
        Report report = new Report(printer1);
        report.calculate();
        report.output();
    }

}
