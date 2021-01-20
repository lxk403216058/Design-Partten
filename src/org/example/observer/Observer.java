package org.example.observer;

/**
 * @description 观察者接口，由观察者来实现
 * @author: lxk
 * @date: 2021-01-20 14:31
 **/
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
