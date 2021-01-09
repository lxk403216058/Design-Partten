package org.example.factory.factoryMethod.pizzaStore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨准备原材料.....");
    }
}
