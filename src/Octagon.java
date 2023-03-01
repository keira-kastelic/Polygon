public class Octagon extends Polygon{ // making an octagon class to extend the polygon class
    public Octagon(){super();} // passing down the variables from the polygon class
    public Octagon (int sides, int sideLengths, int perimeter){ // creating the octagon constructor
        super(sides, sideLengths, perimeter); // reading in the variables from the polygon class
    }
    public int getSides(){return 8;} // overriding the get sides method to make it return 8

    public String toString() { // overriding the toString method to say octagon
        return "Octagon: " + "Sides : 8 " + " Perimeter: " + getPerimeter();
    }

}
