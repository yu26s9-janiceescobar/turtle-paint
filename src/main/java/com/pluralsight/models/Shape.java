package com.pluralsight.models;

import com.pluralsight.util.Turtle;

import java.awt.*;

public abstract class Shape {
    private Turtle turtle;
    private Point location;
    private Color color;
    private int border;


    public Shape(Turtle turtle, Point location, Color color, int border){
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;

    }
    public abstract void paint();


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getLocation() {
        return location;
    }


    public void setLocation(Point location) {
        this.location = location;
    }


    public int getBorder() {
        return border;
    }

    public void setBorder(int width) {
        this.border = width;
    }
}
