// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
// который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class hw4_1 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.addLast(random.nextInt(100));
            System.out.printf("%d ", numbers.getLast());
        }
        System.out.println();
        LinkedList<Integer> reversedLink = getReversedList(numbers);
        for (int item : reversedLink) {
            System.out.printf("%d ", item);
        }
    }

    static LinkedList<Integer> getReversedList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            list.add(i - 1, list.removeLast());
        }
        return list;
    }
}
