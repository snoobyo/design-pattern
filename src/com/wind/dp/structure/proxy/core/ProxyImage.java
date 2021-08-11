package com.wind.dp.structure.proxy.core;

/**
 * @author wind
 */
public class ProxyImage implements Image {

    private String fileName;

    private Reallmage reallmage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (reallmage == null) {
            reallmage = new Reallmage(fileName);
        }
        reallmage.display();
    }
}
