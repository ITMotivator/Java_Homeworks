package oop_3;

public class Freelancer extends Employee {
    private int ratePerDay;

    public Freelancer(String name, String surname, int rate) {
        super(name, surname);
        this.ratePerDay = rate;
    }

    public void calcSalary(int workDays) {
        this.salary = this.ratePerDay * workDays;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер %s %s Зарплата: %d р.", this.name, this.surname, this.salary);
    }
}
