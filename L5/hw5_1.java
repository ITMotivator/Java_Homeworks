// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего

package L5;

import java.util.*;

public class hw5_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Map<String, String> telBook = new HashMap<>();
        System.out.println("Welcome to telephone book!\nMenu");
        boolean flag = true;
        while (flag) {
            System.out.println("1. Add number\n2. Show contacts\n3. Exit");
            Character choice = inp.next().charAt(0);
            inp.nextLine();
            switch (choice) {
                case '1':
                    addNumber(telBook, inp);
                    break;
                case '2':
                    showContacts(telBook);
                    break;
                case '3':
                    System.out.println("Work finished. Good by!");
                    flag = false;
                    break;
                default:
                    System.out.println("Error! Try again");
                    break;
            }
        }
        inp.close();
    }

    static void showContacts(Map<String, String> book) {
        if (book.isEmpty()) {
            System.out.println("Telephone book is empty!");
        } else {
            for (Map.Entry<String, String> item : book.entrySet()) {
                System.out.printf("%s: %s \n", item.getKey(), item.getValue());
            }
        }
    }

    static void addNumber(Map<String, String> book, Scanner input) {
        System.out.println("Enter surname ");
        String name = input.nextLine();
        if (!book.containsKey(name)) {
            System.out.println("Enter telephone number ");
            String number = input.nextLine();
            book.put(name, number);
        } else {
            String oldNumber = book.get(name);
            System.out.println("Add telephone number ");
            String number = input.nextLine();
            String updatedNumber = oldNumber + ", " + number;
            book.put(name, updatedNumber);
        }
        System.out.println("Number added");
    }
}
