package org.example.command;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-17 14:55
 **/
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作
        //创建电灯的对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给遥控器设置相关命令， 比如no = 0时对电灯开合关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("----------按下灯的开按钮---------");
        remoteController.onButtonWasPushed(0);
        System.out.println("----------按下灯的关按钮---------");
        remoteController.offButtonWasPushed(0);
        System.out.println("----------按下撤销按钮---------");
        remoteController.undoButtonWasPushed();

        System.out.println("-------使用遥控器操作电视机--------");
        TvReceiver tvReceiver = new TvReceiver();

        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);

        //给遥控器设置相关命令， 比如no = 1时对电视机开合关的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("----------按下电视机的开按钮---------");
        remoteController.onButtonWasPushed(1);
        System.out.println("----------按下电视机的关按钮---------");
        remoteController.offButtonWasPushed(1);
        System.out.println("----------按下撤销按钮---------");
        remoteController.undoButtonWasPushed();
    }
}
