import java.util.Scanner;  
abstract class Shape {    
     double dim1, dim2;     
     Shape(double d1, double d2) {         
        dim1 = d1;         
        dim2 = d2;     
    }     
    abstract double area(); 
} 
class Rectangle extends Shape {     
    Rectangle(double d1, double d2) {         
        super(d1, d2);     
    }      
    double area() {         
        return dim1 * dim2;     
    } 
} 
class Triangle extends Shape {     
    Triangle(double d1, double d2) {   
        super(d1, d2);     
    }     
    double area() {         
        return 0.5 * dim1 * dim2;     
    } 
}  
public class ShapeDemo {     
    public static void main(String[] args) {        
         Scanner scanner = new Scanner(System.in);          
         System.out.print("Enter length and breadth of rectangle: ");         
         double l = scanner.nextDouble();         
         double b = scanner.nextDouble();         
         Rectangle rect = new Rectangle(l, b);        
          System.out.println("Area of Rectangle: " + rect.area());          
          System.out.print("Enter base and height of triangle: ");         
          double base = scanner.nextDouble();        
           double height = scanner.nextDouble();         
           Triangle tri = new Triangle(base, height);         
           System.out.println("Area of Triangle: " + tri.area());         
            scanner.close();     
        } 
    } 