package oop_7;

import java.util.ArrayList;
import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    private int maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, int maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(ArrayList<String> positions) {
        int salary = random.nextInt(10000, maxSalary);
        int age = random.nextInt(35, 70);
        String position = positions.get(random.nextInt(0, 4));
        Vacancy vacancy = new Vacancy(this.nameCompany, position, salary, age);
        jobAgency.sendOffer(vacancy);
    }

}
