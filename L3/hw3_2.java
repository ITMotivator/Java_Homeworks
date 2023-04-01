// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class hw3_2 {
    public static void main (String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
            System.out.printf("%d ", numbers.get(i));
        } 
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            if (checkCondition(numbers.get(i))) {
                numbers.remove(i);
                i--;
            }
        }
        for (int num : numbers) { 
            System.out.printf("%d ", num);
        }
    }

    static boolean checkCondition(int num) {
        return num % 2 == 0 ? true : false;  
    }
}

