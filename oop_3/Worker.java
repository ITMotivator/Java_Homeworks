package oop_3;

public class Worker extends Employee {

    public Worker(String name, String surname) {
        super(name, surname);
    }

    public Worker(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник %s %s || Стаж: %d || Зарплата: %d р.", this.name, this.surname,
                this.seniority,
                this.salary);
    }
}
