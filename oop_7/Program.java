package oop_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     * добавить новый тип соискателя.
     * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * 
     * @param args
     */
    public static void main(String[] args) {

        String[] professions = { "Юрист", "Разработчик", "Дизайнер", "Менеджер", "Бухгалтер" };
        ArrayList<String> positions = new ArrayList<String>(Arrays.asList(professions));

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", "Разработчик", 100000, 40);
        Master sidorov = new Master("Sidorov", "Дизайнер", 75000, 35);
        Student petrov = new Student("Petrov", "Менеджер", 15000, 21);
        Pensioner makarov = new Pensioner("Makarov", "Юрист", 25000, 66);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(makarov);

        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee(positions);
            System.out.println();
            google.needEmployee(positions);
            System.out.println();
            yandex.needEmployee(positions);
            System.out.println();
        }

    }

}
