package com.base.dp.behavior.visitor.core;

/**
 * @author wind
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
