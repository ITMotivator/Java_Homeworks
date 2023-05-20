package oop_6.spr2;

public class Program {

    // TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        System.out.printf("CN: %s, PRD: %s; QNT: %d, PRS: %d;",
                order.getClientName(), order.getProduct(), order.getQnt(), order.getPrice());
        OrderSaver orderSaver = new OrderSaver(order);
        orderSaver.saveToJson();
        orderSaver.saveToXml();
    }

}
