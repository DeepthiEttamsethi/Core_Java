package LAB6;
public class Rectangle4  extends Shape {
    private double length;
    private double width;
	private double height;
    
    public Rectangle4(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    public double calculateArea() 
    {
        return width * height;
    }
}