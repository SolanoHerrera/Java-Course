package chapter6;
/*
Write a class the creates instances of the rectangle class to find
the total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String [] args){

        /*
         * RECTANGLE1
         */
        Rectangle room1 = new Rectangle();
        room1.setLength(30);
        room1.setWidth(20);
        double areaRoom1 = room1.calculateArea();
        /*
        * Rectangle 2
         */
        Rectangle room2 = new Rectangle(50, 34);
        double areaRoom2 = room2.calculateArea();

        double totalArea = areaRoom1 + areaRoom2;
        System.out.println("Total area: " + totalArea);

    }
}
