package com.emon535.State;

public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush Tool Selected");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush tool deselected");
    }
}
