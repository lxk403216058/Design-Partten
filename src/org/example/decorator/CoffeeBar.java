package org.example.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //2c 1m lb
        //1 点一份lb1
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述1=" + order.getDes());

        //2 加一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用=" + order.cost());
        System.out.println("order 加入一份牛奶 描述=" + order.getDes());

        //3 加一份牛奶加一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加一份巧克力 费用=" + order.cost());
        System.out.println("order 加入一份牛奶 加一份巧克力 描述=" + order.getDes());

        //4 加一份牛奶加两份份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 加两份巧克力 费用=" + order.cost());
        System.out.println("order 加入一份牛奶 加两份巧克力 描述=" + order.getDes());

        System.out.println("=======================");
        Drink order2 = new DeCaf();
        System.out.println("order2 一份无因咖啡 费用=" + order2.cost());
        System.out.println("order2 一份无因咖啡 描述=" + order2.getDes());

        order2 = new Milk(order2);
        System.out.println("order2 一份无因咖啡 加入一份牛奶 费用=" + order2.cost());
        System.out.println("order2 一份无因咖啡 加入一份牛奶 描述=" + order2.getDes());

    }
}
