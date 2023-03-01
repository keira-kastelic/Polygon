import java.util.Random;
public class Rectangle extends Polygon{ // making a rectangle class that extends polygon
    private int length; // creating a length variable
    private int width; // creating a width variable
    public Rectangle() {super(); }// passing down the variables from the polygon class

    public Rectangle(int sides, int sideLengths, int perimeter){ // creating the rectangle constructor
        super(sides, sideLengths, perimeter); // passing down the polygon variables
        Random r = new Random(); // creating a random object
        length = r.nextInt(10)+1; // setting the length bounds
        width = r.nextInt(10)+1; // setting the width bounds
    }

    public int getSides(){return 4;} // overriding the getSides method to return 4

    public String toString() {return "Rectangle: " + "Sides : 4 " + " Perimeter: " + getPerimeter();} // overriding the toSting method to sat rectangle

}