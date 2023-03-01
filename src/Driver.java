import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Polygon a = new Polygon(); // creating a new polygon object
        Polygon b = new Polygon();
        Polygon c = new Polygon();
        Polygon d = new Polygon();

        String A = new String(); // creating a new string
        String B = new String();
        String C = new String();
        String D = new String();

        System.out.println("Polygons!"); // souting polygons
        System.out.println("A: Would you like to create a polygon (1), a rectangle (2), a square (3), or an octagon(4)?"); // prompting the user
        Scanner s = new Scanner (System.in); // creating a new scanner
        int choiceA = s.nextInt(); // readin gin the users input
        switch (choiceA){ // creating a switch statement for the users input
            case 1: a = new Polygon(); // creating a case for if the user enters 1
                System.out.println("Polygon: "+ a.toString()); // printing polygon
                A = "Polygon"; break; // updating string a
            case 2: a = new Rectangle(); // creating a case for if the user enters 2
                System.out.println("Rectangle: "+ a.toString()); // printing rectangle
                A = "Rectangle";break; // updating string a
            case 3: a = new Square();// creating a case for if the user enters 3
                System.out.println("Square: "+ a.toString()); // printing square
                A = "Square"; break; // updating string a
            case 4: a = new Octagon(); // creating a case for if the user enters 4
                System.out.println("Octagon: "+ a.toString()); // printing octagon
                A = "Octagon";} // updating string a

        System.out.println("B: Would you like to create a polygon (1), a rectangle (2), a square (3), or an octagon(4)?"); // repeating the switch statement
        int choiceB = s.nextInt();
        switch (choiceB){
            case 1: b = new Polygon();
                System.out.println("Polygon: "+ a.toString());
                B = "Polygon"; break;
            case 2: b = new Rectangle();
                System.out.println("Rectangle: "+ a.toString());
                B = "Rectangle";break;
            case 3: b = new Square();
                System.out.println("Square: "+ a.toString());
                B = "Square"; break;
            case 4: b = new Octagon();
                System.out.println("Octagon: "+ a.toString());
                B = "Octagon";}

        System.out.println("C: Would you like to create a polygon (1), a rectangle (2), a square (3), or an octagon(4)?"); // repeating the switch statement
        int choiceC = s.nextInt();
        switch (choiceC){
            case 1: c = new Polygon();
                System.out.println("Polygon: "+ a.toString());
                C = "Polygon"; break;
            case 2: c = new Rectangle();
                System.out.println("Rectangle: "+ a.toString());
                C = "Rectangle"; break;
            case 3: c = new Square();
                System.out.println("Square: "+ a.toString());
                C = "Square";break;
            case 4: c = new Octagon();
                System.out.println("Octagon: "+ a.toString());
                C = "Octagon";}

        System.out.println("D: Would you like to create a polygon (1), a rectangle (2), a square (3), or an octagon(4)?"); // repeating the switch statement
        int choiceD = s.nextInt();
        switch (choiceD){
            case 1: d = new Polygon();
                System.out.println("Polygon: "+ a.toString());
                D = "Polygon"; break;
            case 2: d = new Rectangle();
                System.out.println("Rectangle: "+ a.toString());
                D = "Rectangle";break;
            case 3: d = new Square();
                System.out.println("Square: "+ a.toString());
                D = "Square";break;
            case 4: d = new Octagon();
                System.out.println("Octagon: "+ a.toString());
                D = "Octagon";}

        System.out.println("Which two shpaes would you like to compare? A, B, C, or D?"); // prompting the user
        s.nextLine(); // creating a throw away line
        String compare1 = s.nextLine(); // reading in the users input
        switch(compare1){ // creating a switch statement
            case "AB": // creating a case for if the user enters ab
                System.out.println(A + " equals " + B + ": " + a.equals(b)); break; // printing out if it is equal or not
            case "AC": // creating a case for if the user enters ac
                System.out.println(A + " equals " + C + ": " + a.equals(c)); break; // printing out if it is equal or not
            case "AD": // creating a case for if the user enters ad
                System.out.println(A + " equals " + D + ": " + a.equals(d)); break; // printing out if it is equal or not
            case "BC": // creating a case for if the user enters bc
                System.out.println(B + " equals " + C + ": " + b.equals(c)); break; // printing out if it is equal or not
            case "BD": // creating a case for if the user enters bd
                System.out.println(B + " equals " + D + ": " + b.equals(d)); break; // printing out if it is equal or not
            case "CD": // creating a case for if the user enters cd
                System.out.println(C + " equals " + D + ": " + c.equals(d)); break;} // printing out if it is equal or not

        System.out.println("Which two shpaes would you like to compare? A, B, C, or D?"); // repeating the switch statement
        String compare2 = s.nextLine();
        switch(compare2){
            case "AB":
                System.out.println(A + " equals " + B + ": " + a.equals(b)); break;
            case "AC":
                System.out.println(A + " equals " + C + ": " + a.equals(c)); break;
            case "AD":
                System.out.println(A + " equals " + D + ": " + a.equals(d)); break;
            case "BC":
                System.out.println(B + " equals " + C + ": " + b.equals(c)); break;
            case "BD":
                System.out.println(B + " equals " + D + ": " + b.equals(d)); break;
            case "CD":
                System.out.println(C + " equals " + D + ": " + c.equals(d)); break;}
    }
}
