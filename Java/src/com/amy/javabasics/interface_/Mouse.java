package com.amy.javabasics.interface_;

/**
 * @author Amy Wang
 * @version 1.0
 */
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }
}
