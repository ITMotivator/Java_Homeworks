package oop_1;

import java.util.*;

public class DeviceVendingMachine {
    private final Map<Integer, Product> devices;
    private int capacity;
    int countCells;

    public DeviceVendingMachine(int capacity) {
        this.capacity = capacity;
        this.countCells = 1;
        this.devices = new HashMap<Integer, Product>();
    }

    private boolean checkDevice(Product device) {
        if (device.price == 0 || device.name == "noname" || device.type == "Product") {
            System.out.println("Error! Product type, name or price is not specified/set");
            return false;
        }
        return true;
    }

    public void addDevice(Product device) {
        if (this.devices.size() == this.capacity) {
            System.out.println("Error! Machine overloaded.");
        } else if (checkDevice(device)) {
            if (this.devices.isEmpty()) {
                this.devices.put(countCells, device);
                countCells++;
                System.out.println("Device added successfully!");
            } else {
                for (int i = 1; i <= this.capacity; i++) {
                    if (!this.devices.containsKey(i)) {
                        this.devices.put(i, device);
                        System.out.println("Device added successfully!");
                        break;
                    }
                }
            }
        }

    }

    public Product getDevice(int button) {
        if (button > 0 && button <= this.capacity) {
            if (this.devices.get(button) != null) {
                Product toReturn = this.devices.get(button);
                this.devices.remove(button);
                System.out.println("Purchase successful!");
                return toReturn;
            } else {
                System.out.println("Error! Cell empty");
            }
        } else {
            System.out.println("Error! Wrong cell number");
        }
        return null;
    }

    public void showDevices() {
        System.out.println("Devices available:");
        for (Map.Entry<Integer, Product> item : this.devices.entrySet()) {
            System.out.printf("%d. %s\n", item.getKey(), item.getValue());
        }
    }
}
