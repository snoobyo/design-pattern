package com.base.dp.behavior.visitor.core;

/**
 * @author wind
 */
public interface ComputerPartVisitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
