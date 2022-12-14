import java.util.Scanner;
public class Point {
    private double x;
    private double y;

    public Point() {
	    x = y = 0;
    }

    public Point(double x) {
	    this.x = x;
	    this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set_x(double i) {
        x = i;
    }

    public void set_y(double j) {
        y = j;
    }

    public double get_x() {
        return x;
    }

    public double get_y() {
        return y;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinate x:");
        this.x = in.nextDouble();
        System.out.println("Enter the coordinate y:");
        this.y = in.nextDouble();
    }

    public void output() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}