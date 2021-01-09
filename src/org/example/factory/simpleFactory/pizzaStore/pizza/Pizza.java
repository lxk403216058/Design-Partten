package org.example.factory.simpleFactory.pizzaStore.pizza;

//将Pizza做成一个抽象类
public abstract class Pizza {
    protected String name;//名字

    //准备原材料，不同的披萨原材料不同，因此我们做成抽象方法
    public abstract void prepare();

    //烘培
    public void bake() {
        System.out.println(name + "baking .....");
    }

    //
    public void cut() {
        System.out.println(name + "cutting .....");
    }

    //打包
    public void box() {
        System.out.println(name + "box .....");
    }

    public void setName(String name){
        this.name = name;
    }
}
