package ru.home.lesson5;

public class Box {
    public String material;
    public int width, height, length;
    public String color;
    public float weight;
    public boolean isEmpty;
    public boolean isOpened;
    public String owner;

    public float getVolume() {
        return width * height * length;
    }
    public void close() {
        isOpened = false;
    }

    public void open() {
        isOpened = true;
    }

    public void addItem(float itemWeight) {
        weight += itemWeight;
        isEmpty = false;
    }

    public void changeOwner(String ownerName) {
        owner = ownerName;
    }
}
