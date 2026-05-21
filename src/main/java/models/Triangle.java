package models;

import java.awt.*;

public class Triangle extends Shape {
    private final int sides;
    public Triangle(Turtle turtle, Point location, Color color, int border, int penWidth){
        super(turtle,location, color, border, penWidth);
        sides = 3;
    }
    public void paint(){
        getTurtle().setColor(getColor());
        getTurtle().setPenWidth(getPenWidth());

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
