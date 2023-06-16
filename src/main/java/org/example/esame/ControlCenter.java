package org.example.esame;

import java.util.Observable;
import java.util.Observer;

public class ControlCenter implements Observer {
    private String url;

    public ControlCenter(String url) {
        this.url = url;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof FireSensor) {
            FireSensor sensor = (FireSensor) o;
            if (sensor.getSmokeLevel() > 5) {
                triggerAlarm(sensor);
            }
        }
    }

    protected void triggerAlarm(FireSensor sensor) {
        String alarmURL = buildAlarmURL(sensor);
        System.out.println("Triggering alarm: " + alarmURL);
    }

    protected String buildAlarmURL(FireSensor sensor) {
        return url + "?idsonda=" + sensor.getIdSonda() +
                "&lat=" + sensor.getLatitude() +
                "&lon=" + sensor.getLongitude() +
                "&smokelevel=" + sensor.getSmokeLevel();
    }


    public String getUrl() {

        return url;
    }


}
