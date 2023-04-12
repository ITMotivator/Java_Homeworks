import java.util.*;

public class hw6_1 {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        Notebook asus = new Notebook("ASUS VivoBook 17X", 16,
                1024, "Silver", "Windows 11");
        notebooks.put(asus.getModelName(), asus);
        Notebook acer = new Notebook("Acer Nitro 5", 8,
                512, "Black", "Linux");
        notebooks.put(acer.getModelName(), acer);
        Notebook msi = new Notebook("MSI Raider GE77HX", 16,
                1024, "Gray", "Windows 11");
        notebooks.put(msi.getModelName(), msi);
        Notebook lg = new Notebook("LG Gram", 8,
                1024, "Silver", "Windows 10");
        notebooks.put(lg.getModelName(), lg);
        Notebook dell = new Notebook("Dell Precision 5000", 32,
                512, "Gray", "Linux");
        notebooks.put(dell.getModelName(), dell);
        // for (Map.Entry<String, Notebook> item : notebooks.entrySet()) {
        // System.out.println(item.getValue());
        // }

        Scanner inp = new Scanner(System.in);
        menu(inp, notebooks);
    }

    static void menu(Scanner input, Map<String, Notebook> items) {
        boolean flag = true;
        while (flag) {
            System.out.println("Notebooks filter:");
            System.out.println("1. RAM\n2. HDD\n3. Operating System\n4. Color\n5. Exit");
            Character choice = input.next().charAt(0);
            input.nextLine();
            switch (choice) {
                case '1':
                    System.out.println("Enter min value to search ");
                    int minRAM = input.nextInt();
                    ramFilter(minRAM, items);
                    break;
                case '2':
                    System.out.println("Enter min value to search ");
                    int minHDD = input.nextInt();
                    hddFilter(minHDD, items);
                    break;
                case '3':
                    System.out.println("Enter 'w' for Windows or 'l' for Linux to search ");
                    String op = input.next();
                    opFilter(op, items);
                    break;
                case '4':
                    System.out.println("Enter laptop color with a capital first letter (exmp.: Black) to search ");
                    String color = input.next();
                    colorFilter(color, items);
                    break;
                case '5':
                    System.out.println("Good by!");
                    flag = false;
                    break;
                default:
                    System.out.println("Error! Try again");
                    break;
            }
        }
    }

    static void ramFilter(int ramValue, Map<String, Notebook> map) {
        ArrayList<Integer> ramValues = new ArrayList<Integer>();
        for (Map.Entry<String, Notebook> item : map.entrySet()) {
            if (item.getValue().getRamSize() >= ramValue) {
                System.out.println(item.getValue());
                ramValues.add(item.getValue().getRamSize());
            }
        }
        if (ramValues.isEmpty()) {
            System.out.println("Laptops not found");
        }
    }

    static void hddFilter(int hddValue, Map<String, Notebook> map) {
        ArrayList<Integer> hddValues = new ArrayList<Integer>();
        for (Map.Entry<String, Notebook> item : map.entrySet()) {
            if (item.getValue().getHardDiskSize() >= hddValue) {
                System.out.println(item.getValue());
                hddValues.add(item.getValue().getHardDiskSize());
            }
        }
        if (hddValues.isEmpty()) {
            System.out.println("Laptops not found");
        }
    }

    static void opFilter(String opName, Map<String, Notebook> map) {
        if (opName.equals("w") || opName.equals("l")) {
            for (Map.Entry<String, Notebook> item : map.entrySet()) {
                if (opName.equals("w")) {
                    if (item.getValue().getOpSystem().equals("Windows 10") ||
                            item.getValue().getOpSystem().equals("Windows 11")) {
                        System.out.println(item.getValue() + " " + item.getValue().getOpSystem());
                    }
                } else if (opName.equals("l")) {
                    if (item.getValue().getOpSystem().equals("Linux")) {
                        System.out.println(item.getValue() + " " + item.getValue().getOpSystem());
                    }
                }
            }
        } else {
            System.out.println("Error!");
        }
    }

    static void colorFilter(String color, Map<String, Notebook> map) {
        boolean flag = false;
        for (Map.Entry<String, Notebook> item : map.entrySet()) {
            if (item.getValue().getColor().equals(color)) {
                flag = true;
                System.out.println(item.getValue());
            }
        }
        if (flag == false) {
            System.out.println("Laptops not found!");
        }
    }
}
