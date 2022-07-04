package entities;

public class Rectangle {
    
    public Double Area(double width, double height) {
        return width * height;                 
    }
    public Double Perimeter(double width, double height) {
        return 2 * (width + height);
    }
    public Double Diagonal(double width, double height) {
        return Math.sqrt(Math.pow(2, width) + Math.pow(2, height));
    }
}