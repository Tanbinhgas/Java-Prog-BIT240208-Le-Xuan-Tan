/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wildcard.no.collection;

/**
 *
 * @author tanbinhgas
 */
public class SensorBox<T> {
    private T[] data;
    private int index = 0;

    @SuppressWarnings("unchecked")
    public SensorBox(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T item) {
        data[index++] = item;
    }

    public T get(int i) {
        return data[i];
    }

    public int size() {
        return index;
    }
}
