package org.example.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100M");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20CM");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼封顶");
    }
}
