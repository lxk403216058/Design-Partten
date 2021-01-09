package org.example.prototype.improve;


public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色", "青青草原");

        sheep.friend = new Sheep("jackey", 1, "黑色", "狼堡");

        Sheep sheep2 = (Sheep)sheep.clone();//克隆
        Sheep sheep3 = (Sheep)sheep.clone();//克隆
        Sheep sheep4 = (Sheep)sheep.clone();//克隆
        Sheep sheep5 = (Sheep)sheep.clone();//克隆

        System.out.println(sheep+" "+sheep.friend.hashCode());
        System.out.println(sheep2+" "+sheep2.friend.hashCode());
        System.out.println(sheep3+" "+sheep3.friend.hashCode());
        System.out.println(sheep4+" "+sheep4.friend.hashCode());
        System.out.println(sheep5+" "+sheep5.friend.hashCode());

    }
}
