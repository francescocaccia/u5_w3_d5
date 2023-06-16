package org.example.esame;

public class SensorProcess {
    private FireSensor sensor;

    public SensorProcess(FireSensor sensor) {
        this.sensor = sensor;
    }

    public void startListening() {

        System.out.println("sono in ascolto sul sensore con id: " + sensor.getIdSonda());
    }


    public FireSensor getSensor() {

        return sensor;
    }

}

