package oop_6.spr2;

import java.util.Scanner;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void inputFromConsole() {
        Scanner inp = new Scanner(System.in);
        clientName = prompt("Client name: ", inp);
        product = prompt("Product: ", inp);
        qnt = Integer.parseInt(prompt("Quantity: ", inp));
        price = Integer.parseInt(prompt("Price: ", inp));
        inp.close();
    }

    private String prompt(String message, Scanner inp) {
        System.out.print(message);
        String result = inp.nextLine();
        return result;
    }

}
