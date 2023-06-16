package org.example.esame;

public class AlarmSystemFactory {
    public FireSensor createFireSensor(String idSonda, double latitude, double longitude) {
        return new FireSensor(idSonda, latitude, longitude);
    }

    public ControlCenter createControlCenter(String url) {
        return new ControlCenter(url);
    }

    public SensorProcess createSensorProcess(FireSensor sensor) {
        return new SensorProcess(sensor);
    }







}
