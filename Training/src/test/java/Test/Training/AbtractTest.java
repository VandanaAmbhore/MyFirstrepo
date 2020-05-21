package Test.Training;
abstract class Shape
{
	double dim1;
	double dim2;
	Shape(double a, double b)
	{
	dim1=a;
	dim2=b;
	}
	abstract double area();
}
class Rectangle extends Shape
{
	Rectangle(double a, double b)
	{
	super(a, b);
	}
	double area()
	{
	System.out.println("Area of rectangle");
	return dim1*dim2;
	}
}
class Triangle extends Shape
{
	Triangle(double a, double b)
	{
	super(a, b);
	}
	double area()
	{
	System.out.println("Area of triangle");
	return dim1*dim2/2;
	}
}

public class AbtractTest {
	public static void main(String[] args)
	{
	Rectangle r =new Rectangle(10, 20);
	System.out.println(r.area());
	Triangle t =new Triangle(10, 16);
	System.out.println(t.area());
	}


}
