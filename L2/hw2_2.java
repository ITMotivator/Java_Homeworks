// Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileReader;

public class hw2_2 {
    public static void main(String[] args) {
        String fileName = "L2/students.txt";
        File file = new File(fileName);
        String fileString = readFileToString(file);
        parseAndPrint(fileString);
    }

    static String readFileToString(File fileToRead) {
        StringBuilder str = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileToRead);
            // читаем файл посимвольно а записываем в StringBuilder
            int c;
            while ((c = reader.read()) != -1) {
                str.append((char) c);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error of reading file!");
        }
        String s = new String(str);
        return s;
    }

    static void parseAndPrint(String s) {
        if (!s.isEmpty()) {
            String[] lines = s.split("\\n");
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                System.out.println(line.length());
                String[] words = line.split("[:,]");
                for (int j = 0; j < words.length; j++) {
                    String word = words[j].trim();
                    words[j] = word.substring(1, word.length() - 1);
                }
                System.out.printf("Студент %s получил %s по предмету %s.\n", words[1], words[3], words[5]);
            }

        } else {
            System.out.println("Error! String is empty");
        }
    }
}
