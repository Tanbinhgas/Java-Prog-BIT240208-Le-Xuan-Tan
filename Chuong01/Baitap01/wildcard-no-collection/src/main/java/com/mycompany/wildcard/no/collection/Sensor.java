/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wildcard.no.collection;

/**
 *
 * @author tanbinhgas
 */
public abstract class Sensor {
    protected double value;

    public Sensor(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " = " + value;
    }
}
