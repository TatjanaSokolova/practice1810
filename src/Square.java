
public class Square extends Rectangle{

    private int side;

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
//    Let class 'Square' inherit the 'Rectangle' class
//    with its constructor having a parameter for its side
//            (suppose s) calling the constructor of its parent
//    class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.


}