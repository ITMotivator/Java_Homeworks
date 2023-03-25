import java.util.ArrayList;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int item : arr) {
            if (item == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}