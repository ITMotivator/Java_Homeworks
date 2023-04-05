// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;

public class hw4_2 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numbers.addLast(random.nextInt(100));
            System.out.printf("%d ", numbers.getLast());
        }
        System.out.println();

        numbers = enqueue(0, numbers);
        for (int item : numbers) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        dequeue(numbers);
        for (int item : numbers) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        System.out.println(first(numbers));
        for (int item : numbers) {
            System.out.printf("%d ", item);
        }
    }

    static LinkedList<Integer> enqueue(int elem, LinkedList<Integer> list) {
        list.addLast(elem);
        return list;
    }

    static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
