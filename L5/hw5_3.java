// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

package L5;

import java.util.*;

public class hw5_3 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> chessTable = new TreeMap<Integer, Integer>();
        Random random = new Random();
        int number = random.nextInt(0, 8);
        chessTable.put(0, number);
        chessTable = putQueens(chessTable);

        for (Map.Entry<Integer, Integer> item : chessTable.entrySet()) {
            for (int i = 0; i < 8; i++) {
                if (i == item.getValue()) {
                    System.out.print("X  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }

    static TreeMap<Integer, Integer> putQueens(TreeMap<Integer, Integer> treeMap) {
        Random random = new Random();
        int number;
        boolean flag = true;
        while (flag) {
            // Расставляем ферзей по рядам до тех пор, пока они не будут пересекаться по
            // вертикали.
            for (int i = 1; i < 8; i++) {
                boolean internalFlag = true;
                while (internalFlag) {
                    number = random.nextInt(0, 8);
                    for (int j = i - 1; j >= 0; j--) {
                        if (number == treeMap.get(j)) {
                            internalFlag = true;
                            break;
                        } else {
                            internalFlag = false;
                        }
                    }
                    treeMap.put(i, number);
                }
            }
            // Проверяем, пересекаются ли ферзи по дигонали. Если да, возвращаемся к
            // предыдущему циклу.
            for (int i = 0; i < 8; i++) {
                number = treeMap.get(i);
                int right = number + 1;
                int left = number - 1;
                for (int j = i + 1; j < 8; j++) {
                    int nextNumber = treeMap.get(j);
                    if (nextNumber == right || nextNumber == left) {
                        flag = true;
                        break;
                    } else {
                        right++;
                        left--;
                        flag = false;
                    }

                }
                if (flag == true) {
                    break;
                }

            }
        }
        return treeMap;
    }
}
