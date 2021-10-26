package DesignPattern.Observer.Time;

import java.time.LocalTime;

public interface Observer {

    public void update(LocalTime localTime);

}
