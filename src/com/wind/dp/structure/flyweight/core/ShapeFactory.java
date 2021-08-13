package com.wind.dp.structure.flyweight.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wind
 */
public class ShapeFactory {

    public static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle color: " + color);
        }
        return circle;
    }
}
