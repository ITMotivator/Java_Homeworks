package oop_3;

import java.util.ArrayList;
import java.util.Random;

public class Main_3 {

    private static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Employee> employees = createEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        employees.sort(new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        employees.sort(null);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static ArrayList<Employee> createEmployees() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int type = random.nextInt(0, 100);
            int nameInd = random.nextInt(10);
            int surnInd = random.nextInt(10);
            int seniority = random.nextInt(1, 10);

            if (type < 60) {
                int salary = random.nextInt(500, 900);
                Worker staff = new Worker(names[nameInd], surnames[surnInd], salary * 100);
                staff.setSeniority(seniority);
                employees.add(i, staff);

            } else {
                int period = random.nextInt(1, 20);
                int rate = random.nextInt(1, 5) * 1000;
                Freelancer freel = new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], rate);
                freel.calcSalary(period);
                employees.add(i, freel);
            }
        }
        return employees;
    }
}