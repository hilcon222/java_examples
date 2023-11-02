package point;

import java.lang.Math;

public class Point {
	public double x;
	public double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public static double distance(Point a, Point b) {
		double v_dist = Math.abs(a.y - b.y);
		double h_dist = Math.abs(a.x - b.x);
		return (double) Math.sqrt(Math.pow(v_dist,2) + Math.pow(h_dist, 2));
	}

}
