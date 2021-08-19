package com.base.dp.structure.proxy.core;

/**
 * @author wind
 */
public class Reallmage implements Image {

    private String fileName;

    public Reallmage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("image display: " + fileName);
    }


    private void loadFromDisk() {
        System.out.println("image load from disk");
    }
}
