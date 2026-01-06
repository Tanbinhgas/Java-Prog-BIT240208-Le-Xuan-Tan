/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wildcard.no.collection;

/**
 *
 * @author tanbinhgas
 */
public class WildcardNoCollection {

    public static void main(String[] args) {

        SensorBox<TemperatureSensor> tempBox = new SensorBox<>(5);
        tempBox.add(new TemperatureSensor(20));
        tempBox.add(new TemperatureSensor(22));

        SensorBox<PressureSensor> pressureBox = new SensorBox<>(5);
        pressureBox.add(new PressureSensor(100));
        pressureBox.add(new PressureSensor(110));

        // Upper Bounded
        System.out.println("Avg Temp: " +
                SensorProcessor.average(tempBox));
        System.out.println("Avg Pressure: " +
                SensorProcessor.average(pressureBox));

        // Lower Bounded
        SensorBox<Sensor> sensorBox = new SensorBox<>(5);
        SensorProcessor.fillTemperature(sensorBox);

        // Unbounded
        System.out.println("=== Print Temperature Box ===");
        SensorProcessor.printBox(tempBox);

        System.out.println("=== Print Sensor Box ===");
        SensorProcessor.printBox(sensorBox);
    }
}
