package com.wind.dp.structure.bridge;

import com.wind.dp.structure.bridge.core.Circle;
import com.wind.dp.structure.bridge.core.GreenCircle;
import com.wind.dp.structure.bridge.core.RedCircle;
import com.wind.dp.structure.bridge.core.Shape;

/**
 * @author wind
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Shape shape = new Circle(new GreenCircle(), 1, 1, 1);
        shape.draw();

        shape = new Circle(new RedCircle(), 2, 2, 2);
        shape.draw();
    }
}
