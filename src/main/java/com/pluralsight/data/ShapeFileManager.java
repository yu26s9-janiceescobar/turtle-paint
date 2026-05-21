package com.pluralsight.data;

import com.pluralsight.models.Circle;
import com.pluralsight.models.Square;
import com.pluralsight.models.Triangle;
import com.pluralsight.util.Turtle;
import com.pluralsight.util.World;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import com.pluralsight.models.Shape;

public class ShapeFileManager {
    private String fileName;

    private ShapeFileManager(){
        String fileName = "data/painting.csv";
    }

    public ArrayList<Shape> getShapes(){
        ArrayList<Shape> shapes = new ArrayList<>();

        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String firstLine = bufferedReader.readLine();
            World world = makeWorldFromEncodedString(firstLine);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isBlank()){
                    Shape shape = makeShapeFromEncodedString(line, world);
                    shapes.add(shape);
                }
            }
        bufferedReader.close();
        }catch(IOException e){
            throw new RuntimeException("Could not read file.");
        }catch (IllegalArgumentException e){
            throw new RuntimeException(e.getMessage());
        }
        return shapes;
    }

    private Shape makeShapeFromEncodedString(String s, World world) {

        //shape|x|y|border|color|width|height
        String[] line = s.split("\\|");
        String shape = line[0];
        int x = Integer.parseInt(line[1]);
        int y = Integer.parseInt(line[2]);
        Point location = new Point(x, y);
        int border = Integer.parseInt(line[3]);
        Color color = Color.getColor(line[4]);
        int width = Integer.parseInt(line[5]);
        int height = Integer.parseInt(line[6]);
        Turtle turtle = new Turtle(world, location.x, location.y);

        return switch (shape) {
            case "square" -> new Square(turtle, location, color, border);

            case "triangle" -> new Triangle(turtle, location, color, border);

            case "circle" -> new Circle(turtle, location, color, border);
            default -> throw new IllegalArgumentException("Unexpected shape in file: " + shape);
        };

    }
    private World makeWorldFromEncodedString(String s){
        //width|height|background
        String[] line = s.split("\\|");
        int width = Integer.parseInt(line[0]);
        int height = Integer.parseInt(line[1]);
        Color color = Color.getColor(line[2]);
        return new World(width, height, color );

    }

    public void saveShapes(ArrayList<Shape> shapes){
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("width|height|background");

            for (Shape s: shapes){
                String.format("%d|%d|%d", )
            }


            bufferedWriter.close();
        }catch (IOException e){
            throw new RuntimeException("Trouble saving file.");
        }
    }


}
