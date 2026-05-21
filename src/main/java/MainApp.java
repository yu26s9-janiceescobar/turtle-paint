import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        World world = new World(1000,1000);
        Turtle turtle = new Turtle(world, 0, 0);
    }
}
