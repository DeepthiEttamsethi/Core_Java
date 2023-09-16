package LAB6;
public class Triangle4  extends Shape {
    private double base;
    private double height;
    
    public Triangle4(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() 
    
    {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
		return area;
    }

}
