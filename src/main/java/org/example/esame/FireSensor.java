package org.example.esame;

import java.util.Observable;

public class FireSensor extends Observable {
    private final String idSonda;
    private final double latitude;
    private final double longitude;
    private int smokeLevel;

    public FireSensor(String idSonda, double latitude, double longitude) {
        this.idSonda = idSonda;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getIdSonda() {
        return idSonda;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getSmokeLevel() {
        return smokeLevel;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
        setChanged();
        notifyObservers();
    }
}
