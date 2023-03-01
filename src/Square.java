public class Square extends Rectangle{ // creating a square class to extend the rectangle class
    public Square(){super();} // passing down the variables form the polygon class
    public Square(int sides, int sideLengths, int perimeter){ // creating a square constructor
        super(sides, sideLengths, perimeter); // passing down the variables from the rectangle class
    }
    public int getSides(){return 4;} // overriding the getSides method to return 4
    public String toString() {
        return "Square: " + "Sides : 4 " + " Perimeter: " + getPerimeter();} // overriding the toSting method to say square
}
