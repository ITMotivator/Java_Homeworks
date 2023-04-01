// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class hw3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
            System.out.printf("%d ", numbers.get(i));
        }
        System.out.println();
        minMaxAvg(numbers);
    }

    static void minMaxAvg(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.size();
        nums.sort(null);
        System.out.printf("Min - %d, Max - %d, Average - %.2f ", nums.get(0), nums.get(nums.size() - 1), avg);
    }
}
