package LLD.Behavioural_Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(float temperature);
}

// Subject interface
interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}

// Create Implementation class for Subject interface
class WeatherStation implements Subject {

    private float temperature;
    private final List<Observer> observerList;

    WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        this.observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        this.observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : this.observerList) {
            obs.update(this.temperature);   // Runtime polymorphism
        }
    }
}

class DisplayDevice implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature on display is " + temperature);
    }
}
class Mobile implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature on mobile is " + temperature);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create Publisher
        WeatherStation weatherStation = new WeatherStation();

        // Create receivers/observers
        Observer displayDevice = new DisplayDevice();
        Observer mobile = new Mobile();

        // Attach observer
        weatherStation.attach(displayDevice);
        weatherStation.attach(mobile);

        // set temperature
        weatherStation.setTemperature(32.3f);

        // detach observer
        weatherStation.detach(mobile);

        // Again set temperature
        weatherStation.setTemperature(23.8f);
    }
}