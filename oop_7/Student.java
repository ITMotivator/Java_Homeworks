package oop_7;

public class Student implements Observer {

    private String name;
    private int expectedSalary;
    private String profession;
    private int age;

    public Student(String name, String profession, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.expectedSalary = salary;
        this.age = age;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.expectedSalary < vacancy.getSalary() && this.profession == vacancy.getPosition()
                && this.age < vacancy.getMaxAge()) {
            System.out.printf("Студент %s %s %d >>> Мне нужна эта работа! %s\n", profession, name, age, vacancy.toString());
            this.expectedSalary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s %s %d >>> Продолжаю поиск! %s\n", profession, name, age, vacancy.toString());
        }
    }
}
