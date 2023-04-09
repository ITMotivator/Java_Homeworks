// Пусть дан список сотрудников. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package L5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class hw5_2 {
    public static void main(String[] args) {
        String filePath = "L5/employees.txt";
        File file = new File(filePath);
        Map<String, String> employees = new HashMap<>();
        employees = readFileToHashMap(file, employees);
        Map<String, Integer> countedNames = new HashMap<>();
        countedNames = countSameNames(employees);

        for (Map.Entry<String, Integer> item : countedNames.entrySet()) {
            if (item.getValue() > 1) {
                System.out.printf("%s: %s \n", item.getKey(), item.getValue());
            }
        }
        System.out.println();

        TreeMap<String, String> sortedEmpList = new TreeMap<String, String>();
        sortedEmpList = sortByNameRepeats(employees, countedNames);
        for (Map.Entry<String, String> item : sortedEmpList.entrySet()) {
            System.out.printf("%s %s \n", item.getValue(), item.getKey());
        }
    }

    static Map<String, String> readFileToHashMap(File fileToRead, Map<String, String> map) {
        try {
            FileReader reader = new FileReader(fileToRead);
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] emp = line.split(" ");
                map.put(emp[1], emp[0]);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error of reading file!");
        }
        return map;
    }

    static Map<String, Integer> countSameNames(Map<String, String> map) {
        Map<String, Integer> resultMap = new HashMap<>();
        ArrayList<String> names = new ArrayList<String>(map.values());
        for (String name : names) {
            if (resultMap.containsKey(name)) {
                resultMap.put(name, resultMap.get(name) + 1);
            } else {
                resultMap.put(name, 1);
            }
        }
        return resultMap;
    }

    static TreeMap<String, String> sortByNameRepeats(Map<String, String> mapOfEmp,
            Map<String, Integer> mapOfNames) {
        TreeMap<String, String> sorted = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String surname1, String surname2) {
                String name1 = mapOfEmp.get(surname1);
                String name2 = mapOfEmp.get(surname2);
                int diff = mapOfNames.get(name1) - mapOfNames.get(name2);
                if (diff != 0)
                    return diff * (-1);
                else {
                    if (!name1.equals(name2))
                        return name1.compareTo(name2);
                }
                return surname1.compareTo(surname2);
            }
        });
        sorted.putAll(mapOfEmp);
        return sorted;
    }
}
