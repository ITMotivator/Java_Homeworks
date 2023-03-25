// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package L1;

import java.util.Scanner;

public class hw1_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNum = inp.nextInt();
        String sign = inp.next();
        int secondNum = inp.nextInt();
        switch (sign) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.println((double) firstNum / secondNum);
                break;
            default:
                System.out.println("Error!");
        }
        inp.close();
    }
}
