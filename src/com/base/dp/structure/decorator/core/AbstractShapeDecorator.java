package com.base.dp.structure.decorator.core;

/**
 * @author wind
 */
public abstract class AbstractShapeDecorator implements Shape {

    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
