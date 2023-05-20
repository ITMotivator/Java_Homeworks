package oop_6.spr2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderSaver {
    private final Order order;

    public OrderSaver(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "./oop_6/spr2/order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getPrice() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveToXml() {
        String fileName = "./oop_6/spr2/order.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<order>\n");
            writer.write("<clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("<product>" + order.getPrice() + "</product>\n");
            writer.write("<qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("<price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
