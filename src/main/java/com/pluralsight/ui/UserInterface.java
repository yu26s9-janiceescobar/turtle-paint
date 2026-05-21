
package com.pluralsight.ui;
import com.pluralsight.util.Turtle;
import com.pluralsight.util.World;

import java.awt.*;

public class UserInterface {
    private World world;
    private Turtle turtle;

    public void init(){
        int worldSize = Console.promptForIntRange("Enter the size of the world canvas: ", 200, 1000);
        world = new World(worldSize, worldSize);
    }
    public void display(){
        int option;
        do {
            System.out.println("""
                    Home Screen
                    1) Add Shape
                    2) Save Image
                    3) Save Painting
                    4) Open Painting
                    0) Exit""");

            option = Console.promptForIntRange("> ", 0, 4);
            switch(option){
                case 1:
                    //processAddShape();
                    break;
                case 2:
                    //processSaveImage();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Exiting Application...");
                    break;
            }
        }while(option != 0);

    }
    private void processAddShape(){
        System.out.println("Which Shape (1. Square, 2. Circle, 3. Triangle)? ");
        int shapeChoice = Console.promptForIntRange("> ", 1, 3);
        //Turtle turtle, Point location, Color color, int border, int penWidth
        switch (shapeChoice){
            case 1:
                //processAddSquare();
                break;
            case 2:
                //processAddCircle();
                break;
            case 3:
                //processAddTriangle();
                break;
        }
    }
    private void processAddSquare(){

    }
}
