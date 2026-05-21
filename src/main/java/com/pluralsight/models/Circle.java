package com.pluralsight.models;

import com.pluralsight.util.Turtle;

import java.awt.*;

public class Circle extends Shape {
    public Circle(Turtle turtle, Point location, Color color, int border){
        super(turtle, location, color, border);
    }
    public void paint(){
        getTurtle().setColor(getColor());

        getTurtle().goTo(getLocation());


        for (int i = 0; i < getBorder(); i++){
            getTurtle().forward(i);
            getTurtle().turnRight(360);
        }


    }

}
