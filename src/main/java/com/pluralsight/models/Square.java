package com.pluralsight.models;

import com.pluralsight.util.Turtle;

import java.awt.*;

public class Square extends Shape {
    private final int sides;
    public Square(Turtle turtle, Point location, Color color, int border){
        super(turtle, location, color, border);
        sides = 4;

    }

    public void paint(){
        getTurtle().setColor(getColor());
        getTurtle().goTo(getLocation());


        for (int i = 0 ; i < sides ; i++){
            getTurtle().forward(getBorder());
            getTurtle().turnRight(getExteriorDegree(sides));
        }
    }
    public int getExteriorDegree(int numOfSides){
        return 360 / numOfSides;
    }
}
