// Вывести все простые числа от 1 до 1000

package L1;

public class hw1_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            Boolean flag = true;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            if (flag) {
                System.out.printf("%d ", i);
            }

        }
    }
}
