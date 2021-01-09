package org.example.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基5M");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙10CM");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
