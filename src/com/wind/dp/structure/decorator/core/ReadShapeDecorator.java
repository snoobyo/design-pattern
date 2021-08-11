package com.wind.dp.structure.decorator.core;

/**
 * @author wind
 */
public class ReadShapeDecorator extends AbstractShapeDecorator {

    public ReadShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("set red border");
    }
}
