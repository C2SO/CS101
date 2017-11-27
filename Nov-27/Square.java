public class Square extends Rectangle {
    //Square inherits length and width from Rectangle
    public Square(double side) {
        super(side, side); //Explicitly calling rectangle constructor
    }

    // public Square(double side) {
    //     super(side, side); Explicitly calling rectangle constructor
    //     length = side;
    //     width = side;
    // }

    public Square() {
        //Implicitly calling constructor Rectangle(), the default
    }

    //override the toString() medthod of Rectangle
    public String toString() {
        return "A square with the side equal to " + length;
    }
}