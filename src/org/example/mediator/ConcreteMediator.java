package org.example.mediator;

import java.util.HashMap;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-21 14:43
 **/
public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 更具得到消息，完成对应任务
     * 2. 中介者在这个方法，协调各个具体的同时对象，完成任务
     *
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTv();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }
    }

    @Override
    public void sendMessage() {

    }
}
