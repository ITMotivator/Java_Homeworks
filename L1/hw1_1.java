// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package L1;

import java.util.Scanner;

public class hw1_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any positive number ");
        int number = inp.nextInt();
        int triangle = 1;
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            triangle += i;
            factorial *= i;
        }
        System.out.printf("Triangle number = %d\nFactorial = %d", triangle, factorial);
        inp.close();
    }
}
