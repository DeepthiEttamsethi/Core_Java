package LAB6;
public class Circle4 extends Shape {
    private double radius;
    
    public Circle4(double radius) 
    {
        this.radius = radius;
    }
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
     }
}