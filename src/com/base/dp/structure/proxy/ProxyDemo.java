package com.base.dp.structure.proxy;

import com.base.dp.structure.proxy.core.Image;
import com.base.dp.structure.proxy.core.ProxyImage;

/**
 * @author wind
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("io.image");
        image.display();
        image.display();
    }
}
