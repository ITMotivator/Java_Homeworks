// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;

public class hw2_1 {

    public static void main(String[] args) {
        int[] array = new int[] { 2, 4, 6, 3, 7, 1, 9, 4 };
        sortAndLog(array);
    }

    static void swap(int max, int toChange, int[] arr) {
        int temp = arr[toChange];
        arr[toChange] = arr[max];
        arr[max] = temp;
    }

    static void sortAndLog(int[] arr) {
        String file_name = "L2/logger.txt";
        File logger = new File(file_name);
        try {

            int arrLen = arr.length;
            FileWriter writer = new FileWriter(logger, true);
            for (int i = 0; i < arrLen - 1; i++) {
                for (int j = 0; j < arrLen - i - 1; j++) {
                    if (arr[j + 1] > arr[j]) {
                        swap(j + 1, j, arr);
                    }
                }
                for (int k = 0; k < arrLen; k++) {
                    writer.write(arr[k] + " ");
                }
                writer.write("\n");
            }
            writer.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
