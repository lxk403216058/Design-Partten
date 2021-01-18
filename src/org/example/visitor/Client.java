package org.example.visitor;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-18 14:46
 **/
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        //成功
        Success success = new Success();
        objectStructure.display(success);

        //失败
        System.out.println("-----------------------");
        Fail fail = new Fail();
        objectStructure.display(fail);
        //待定
        System.out.println("-----------------------");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
