package oop_7;

public class Vacancy {
    private String companyName;

    private int salary;

    private String position;

    private int maxAge;

    public Vacancy(String companyName, String position, int salary, int maxAge) {
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
        this.maxAge = maxAge;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getPosition() {
        return this.position;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    @Override
    public String toString() {
        return String.format("%s. Позиция: %s. Зарплата: %d. Макс.возраст: %d", companyName, position, salary, maxAge);
    }

}
