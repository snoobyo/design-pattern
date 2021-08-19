package com.base.dp.structure.facade;

import com.base.dp.structure.facade.core.ShapeMaker;

/**
 * @author wind
 */
public class FacadeDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectAngle();
    }
}
