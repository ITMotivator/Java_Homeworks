import java.util.*;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class hw4_3 {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        calc(queue);

    }

    static void calc(Deque<Integer> queue) {
        Scanner inp = new Scanner(System.in);
        System.out.println("To exit press 'q'");
        System.out.println("To cancel last operation press 'c'");
        System.out.println("Start calculations: press 'Enter' after each input (number or sign)");

        int firstNum = inp.nextInt();
        String sign = inp.next();
        int nextNum = inp.nextInt();
        int res = getResult(firstNum, nextNum, sign);
        System.out.printf("Result = %d \n", res);
        queue.addLast(res);
        while (true) {
            sign = inp.next();
            if (sign.equals("q")) {
                System.out.println("Calculations finished");
                break;
            } else if (sign.equals("c")) {
                queue.removeLast();
                if (!queue.isEmpty()) {
                    res = queue.getLast();
                    System.out.printf("Result = %d \n", res);
                } else {
                    System.out.println("Calculations finished");
                    break;
                }
            } else {
                nextNum = inp.nextInt();
                res = getResult(queue.getLast(), nextNum, sign);
                if (res != 0) {
                    System.out.printf("Result = %d \n", res);
                    queue.addLast(res);
                } else {
                    System.out.println("Error! Calculations finished");
                    break;
                }
                
            }
        }
        inp.close();
    }

    static int getResult(int num1, int num2, String sign) {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                System.out.println("Error!");
                return 0;
        }
    }
}
