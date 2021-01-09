package org.example.builder.improve;

//抽象到的建造者
public abstract class HouseBuilder {
    protected  House house = new House();

    //将即建造的流程写好，抽象1方法
    public abstract void  buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    //建造房子,将产品（房子）返回
    public House buildHouse(){
        return house;
    }
}
