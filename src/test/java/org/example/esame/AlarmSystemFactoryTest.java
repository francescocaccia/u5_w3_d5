package org.example.esame;

import org.junit.Assert;
import org.junit.Test;

public class AlarmSystemFactoryTest {

    //i metodi di test non accettano nessun parametro
    @Test
    public void createFireSensorWithGivenParam() {

        AlarmSystemFactory alarmSystemFactory = new AlarmSystemFactory();
        FireSensor fireSensor = alarmSystemFactory.createFireSensor("7890", 324.43, 9786.45);

        Assert.assertNotNull(fireSensor);//Assert.assertNotNull è un metodo statico di assert che è una classe contenuta in Junit
        Assert.assertEquals("7890", fireSensor.getIdSonda());
        Assert.assertEquals(324.43, fireSensor.getLatitude(), 0.0);
        Assert.assertEquals(9786.45, fireSensor.getLongitude(), 0.0);
        Assert.assertEquals(0, fireSensor.getSmokeLevel());
    }

    @Test
    public void createControlCenterWithGivenParam() {

        AlarmSystemFactory alarmSystemFactory = new AlarmSystemFactory();
        ControlCenter createControlCenter = alarmSystemFactory.createControlCenter("http://carabinieri.it");
        Assert.assertNotNull(createControlCenter);
        Assert.assertEquals("http://carabinieri.it", createControlCenter.getUrl());

    }

    @Test
    public void createSensorProcessWithGivenParam() {
        AlarmSystemFactory alarmSystemFactory = new AlarmSystemFactory();
        FireSensor fireSensor = new FireSensor("9090", 32.32, 54.56);
        SensorProcess createSensorProcess = alarmSystemFactory.createSensorProcess(fireSensor);
        Assert.assertEquals(fireSensor, createSensorProcess.getSensor());

    }

}
