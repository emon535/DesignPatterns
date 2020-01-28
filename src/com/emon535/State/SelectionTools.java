package com.emon535.State;

public class SelectionTools implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection Icon Selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a Rectangle");
    }
}
