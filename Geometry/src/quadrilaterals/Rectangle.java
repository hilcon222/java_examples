package quadrilaterals;
import point.Point;
import java.math.*;

public class Rectangle {
	public double width;
	public double height;
	public Point center;
	public Rectangle(double w, double h, Point center) {
		this.width = w;
		this.height = h;
		this.center = center;
	}
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	public double area() {
		return this.width * this.height;
	}
}
