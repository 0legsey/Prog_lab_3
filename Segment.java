import java.util.Scanner;
public class Segment {
    private double length;
    private Point a;
    private Point b;

    public Segment() {
        this.a = new Point();
        this.b = new Point();
        this.length = 0;
    }

    public Segment(Point a) {
        this.a = a;
        this.b = new Point();
        this.length = length_calc();
    }

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.length = length_calc();
    }

    public void set_a(Point i) {
        a = i;
    }

    public void set_b(Point j) {
        b = j;
    }

    public void set_length(double l) {
        length = l;
    }

    public Point get_a() {
        return a;
    }

    public Point get_b() {
        return b;
    }

    public double get_length() {
        return length;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        Point a = new Point();
        Point b = new Point();
        System.out.println("Enter the coordinates of the first point:");
        a.input();
        System.out.println("Enter the coordinates of the second point:");
        b.input();
        this.a = a;
        this.b = b;
        this.length = length_calc();
    }

    public void output() {
        System.out.println("The coordinates of the first point: ");
        this.a.output();
        System.out.println("The coordinates of the first point: ");
        this.b.output();
        System.out.println("Segment length is " + this.length);
    }

    public double length_calc() {
        double len;
        len = Math.pow(a.get_x() - b.get_x(), 2) + Math.pow(a.get_y() - b.get_y(), 2);
        return Math.sqrt(len);
    }
}
