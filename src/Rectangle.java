
public class Rectangle {


    //    Create a class named 'Rectangle' with two data members
//        'length' and 'breadth' and two methods to print the
//    area and perimeter of the rectangle respectively. Its constructor
//    having parameters for length and breadth is used to initialize
//    length and breadth of the rectangle.

    private int length;
    private int breadth;

    //Methods to print length and breadth
    public void printLength(){
        System.out.println("The length is: " + this.length);
    }
    public void printBreadth(){
        System.out.println("The breadth is: " + this.breadth);
    }
//constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

//Methods to calculate the area and perimeter.
    public int countArea(){
        int area = this.length * this.breadth;
        System.out.println("Object's area is: " + area);
        return area;
    }
    public int countPerimeter(){
        int perimeter = (this.length + this.breadth) * 2;
        System.out.println("Object's perimeter is: " + perimeter);
        return perimeter;
    }
}