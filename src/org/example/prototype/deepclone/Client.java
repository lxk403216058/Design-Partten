package org.example.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "aaa";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("daniu", "xiaoniu");

        //方式一：完成深拷贝
        /*DeepProtoType clone = (DeepProtoType) deepProtoType.clone();

        System.out.println(deepProtoType.name + " " + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(clone.name+ " " + clone.deepCloneableTarget.hashCode());*/

        //方式二完成深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.name + " " + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(clone.name+ " " + clone.deepCloneableTarget.hashCode());
    }
}
