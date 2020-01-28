package com.emon535.State;

public class CircleTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("CircleTool Selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Circle tool working");
    }
}
