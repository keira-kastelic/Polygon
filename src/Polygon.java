/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan and Collin
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/


import java.util.Random;
public class Polygon {// creating the new polygon class
    private int sides; // making a sides variable
    private int sideLengths; // making a lengths variable
    private int perimeter; // making a parimeter variable

    public Polygon() { // initializing the variables
        Random r = new Random(); // creating a random object
        sides = r.nextInt(8)+3; // making random number sides
        sideLengths = r.nextInt(10)+1; // making rangom side length
        perimeter = sideLengths * sides; // calculating the perimeter
    }

    public Polygon(int sides, int sideLengths, int perimeter){ // creating a default constructor
        this.sides = sides;
        this.sideLengths = sideLengths;
        this.perimeter = perimeter;
    }

    public int getSides() {return sides;} // making a get sides method
    public int getSideLengths() {return sideLengths;} // making a get sides length method
    public int getPerimeter() {return perimeter;} // making a get perimeter method

    public void setSides(){this.sides = sides;} // making a set sides method
    public void setSideLengths(){this.sideLengths = sideLengths;} // making a set lengths method

    public boolean equals(Polygon polygonOther) { // making a new equals method to override the object class
        if(this.sides == polygonOther.getSides()){
            return true;
        } else{
            return false;
        }
    }

    // compares two polygons to see if they have the same number of sides
    public String toString() {
        return "Polygon: " + "Sides : " + sides + " Perimeter: " + perimeter;
    }
// returns a String that tells the user the type of shape, # of sides, and perimeter
}