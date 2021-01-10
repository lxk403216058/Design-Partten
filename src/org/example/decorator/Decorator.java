package org.example.decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //先拿自己的价格getPrice
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes() 输出了被装饰者的信息
        return super.des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
