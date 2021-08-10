package com.wind.dp.behavior.visitor;

import com.wind.dp.behavior.visitor.core.Computer;
import com.wind.dp.behavior.visitor.core.ComputerPartDisplayVisitor;

/**
 * @author wind
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
