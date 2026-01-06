/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wildcard.no.collection;

/**
 *
 * @author tanbinhgas
 */
public class SensorProcessor {

    // =========================
    // 1. Upper Bounded Wildcard
    // =========================
    // Chỉ đọc dữ liệu
    public static double average(SensorBox<? extends Sensor> box) {
        double sum = 0;
        for (int i = 0; i < box.size(); i++) {
            sum += box.get(i).getValue();
        }
        // box.add(...) ❌
        return sum / box.size();
    }

    // =========================
    // 2. Lower Bounded Wildcard
    // =========================
    // Ghi dữ liệu
    public static void fillTemperature(
            SensorBox<? super TemperatureSensor> box) {

        box.add(new TemperatureSensor(25));
        box.add(new TemperatureSensor(30));
        // TemperatureSensor t = box.get(0); ❌
    }

    // =========================
    // 3. Unbounded Wildcard
    // =========================
    // Không quan tâm kiểu
    public static void printBox(SensorBox<?> box) {
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
    }
}
