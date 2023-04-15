package oop_1;

public class Main_1 {
    public static void main(String[] args) {

        DeviceVendingMachine machine1 = new DeviceVendingMachine(10);
        Product phone1 = new Product("A5");
        System.out.println(phone1);
        machine1.addDevice(phone1);

        Phone phone2 = new Phone("Iphone7");
        System.out.println(phone2);
        machine1.addDevice(phone2);
        phone2.setPrice(250);
        phone2.setDisplaySize(10);
        System.out.println(phone2);
        machine1.addDevice(phone2);

        Product phone3 = new Phone("Samsung", "Galaxy S60", 20, 500);
        System.out.println(phone3);
        machine1.addDevice(phone3);

        System.out.println();
        System.out.println(phone2 instanceof Phone); 
        machine1.showDevices();

        phone1 = phone2;
        // phone1.setDisplaySize(10);
        System.out.println(phone1);
        phone1.setBrand("Iphone");
        phone1.setName("Iphone9");
        phone1.setPrice(600);
        machine1.addDevice(phone1);

        System.out.println();
        System.out.println(phone2 instanceof Product); 
        machine1.showDevices();


        Product toBuy1 = machine1.getDevice(5);
        System.out.println(toBuy1);
        Product toBuy2 = machine1.getDevice(2);
        System.out.println(toBuy2);
        machine1.showDevices();
    }
}
