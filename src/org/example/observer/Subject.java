package org.example.observer;


/**
 * @description 让WeatherData来实现
 * @author: lxk
 * @date: 2021-01-20 14:29
 **/
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
