package org.example;

import org.example.esame.AlarmSystemFactory;
import org.example.esame.ControlCenter;
import org.example.esame.FireSensor;
import org.example.esame.SensorProcess;

public class Main {
    public static void main(String[] args) {

        AlarmSystemFactory alarmSystemFactory = new AlarmSystemFactory();
        FireSensor fireSensor = alarmSystemFactory.createFireSensor("12345", 324.4, 324.2);
        ControlCenter controlCenter = alarmSystemFactory.createControlCenter("http://pompieri.it/");
        SensorProcess sensorProcess = alarmSystemFactory.createSensorProcess(fireSensor);

        fireSensor.addObserver(controlCenter);
        sensorProcess.startListening();
        fireSensor.setSmokeLevel(6);
    }
}
