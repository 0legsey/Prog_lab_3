import java.util.Scanner;
public class Circle {
    private Segment radius;
    private Point center;
    private Point circle_point;

    public Circle() {
        this.center = new Point();
        this.circle_point = new Point();
        this.radius = new Segment();
    }

    public Circle(Point center) {
        this.center = center;
        this.circle_point = new Point();
        this.radius = new Segment(this.center, this.circle_point);
    }

    public Circle(Point center, Point circle_point) {
        this.center = center;
        this.circle_point = circle_point;
        this.radius = new Segment(this.center, this.circle_point);
    }

    public void set_center(Point i) {
        center = i;
    }

    public void set_circle_point(Point j) {
        circle_point = j;
    }

    public void set_radius(Segment r) {
        radius = r;
    }

    public Point get_center() {
        return center;
    }

    public Point get_circle_point() {
        return circle_point;
    }

    public Segment get_radius() {
        return radius;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        Point center = new Point();
        Point circle_point = new Point();
        System.out.println("Enter the coordinates of the center:");
        center.input();
        System.out.println("Enter the coordinates of the point on the circle:");
        circle_point.input();
        Segment radius = new Segment(center, circle_point);
        this.center = center;
        this.circle_point = circle_point;
        this.radius = radius;
    }

    public void output() {
        System.out.println("The coordinates of the center: ");
        this.center.output();
        System.out.println("The coordinates of the point on the circle: ");
        this.circle_point.output();
        System.out.println("Radius length is " + this.radius.get_length());
        System.out.println("Circle length is " + this.circle_length());
        System.out.println("Circle area is " + this.circle_area());
    }

    public double circle_length() {
        double len;
        len = 2 * Math.PI * radius.get_length();
        return len;
    }

    public double circle_area() {
        double area;
        area = Math.PI * Math.pow(radius.get_length(), 2);
        return area;
    }

}
