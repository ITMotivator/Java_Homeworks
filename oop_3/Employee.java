package oop_3;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected int salary;
    protected int seniority;// трудовой стаж

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getSeniority() {
        return this.seniority;
    }

    public String toString() {
        return String.format("%s %s Зарплата: %d р.", this.name, this.surname, this.salary);
    }

    @Override
    public int compareTo(Employee o) {
        int res = Integer.compare(seniority, o.getSeniority());
        if (res == 0) res = o.name.compareTo(name);
        return res;
    }
}
