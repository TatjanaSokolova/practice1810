
public class CountingAreaPerimeter {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Square square1 = new Square(6);

        //Calling methods to Print the area and perimeter of a rectangle and a square.
        rectangle1.countArea();
        rectangle1.countPerimeter();
        square1.countArea();
        square1.countPerimeter();


        //Now repeat the above example to print the area of 10 squares.
        //Hint-Use array of objects

        Square[ ] squareObjects = new Square[10];
        squareObjects[0] = new Square(4);
        squareObjects[1] = new Square(5);
        squareObjects[2] = new Square(34);
        squareObjects[3] = new Square(2);
        squareObjects[4] = new Square(45);
        squareObjects[5] = new Square(567);
        squareObjects[6] = new Square(321);
        squareObjects[7] = new Square(10);
        squareObjects[8] = new Square(12);
        squareObjects[9] = new Square(10000);

        for (int i = 0; i < squareObjects.length; i++) {
            squareObjects[i].countArea();
        }
    }
}

