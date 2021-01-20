package org.example.observer;

/**
 * @description
 * @author: lxk
 * @date: 2021-01-20 14:49
 **/
public class BaiduSite implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("BaiDu ");
        System.out.println("---Baidu Today mTemperature: " + temperature + "---");
        System.out.println("---Baidu Today mPressure: " + pressure + "---");
        System.out.println("---Baidu Today mHumidity: " + humidity + "---");
    }
}
