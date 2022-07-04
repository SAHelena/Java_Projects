package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;;

public class ProgramRectangle {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle width and height:");
        Double width = sc.nextDouble();
        Double height = sc.nextDouble();

        System.out.printf("%s = %.2f %n", "AREA", rectangle.Area(width, height));
        System.out.printf("%s = %.2f %n", "PERIMETER", rectangle.Perimeter(width, height));
        System.out.printf("%s = %.2f %n", "DIAGONAL", Math.ceil(rectangle.Diagonal(width, height)));
        
        sc.close();
        
    }
}
