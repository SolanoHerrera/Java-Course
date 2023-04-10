package chapter6;

public class Rectangle {
    double length;
    double width;

    public Rectangle(){   //Constructor 1 (default)
        length = 0;
        width = 0;
    }
    public Rectangle(double lenght, double widht){   //Constructor 2
        this.length = lenght;
        this.width = widht;
    }
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2 * length + 2 * width;
    }
}
