import java.util.Scanner;
public class Square {
    private Segment diagonal;
    private Point b;
    private Point d;

    public Square() {
        this.b = new Point();
        this.d = new Point();
        this.diagonal = new Segment();
    }

    public Square(Point b) {
        this.b = b;
        this.d = new Point();
        this.diagonal = new Segment(b, d);
    }

    public Square(Point b, Point d, Segment diagonal) {
        this.b = b;
        this.d = d;
        this.diagonal = new Segment(this.b, this.d);
    }

    public void set_b(Point i) {
        b = i;
    }

    public void set_d(Point j) {
        d = j;
    }

    public void set_diagonal(Segment r) {
        diagonal = r;
    }

    public Point get_b() {
        return b;
    }

    public Point get_d() {
        return d;
    }

    public Segment get_diagonal() {
        return diagonal;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        Point b = new Point();
        Point d = new Point();
        System.out.println("Enter the coordinates of the first point on diagonal");
        b.input();
        System.out.println("Enter the coordinates of the second point on diagonal");
        d.input();
        this.diagonal = new Segment(b, d);
        this.b = b;
        this.d = d;
    }

    public void output() {
        System.out.println("The coordinates of the first point on diagonal: ");
        this.b.output();
        System.out.println("The coordinates of the first point on diagonal: ");
        this.d.output();
        System.out.println("Diagonal length is " + this.diagonal.get_length());
        System.out.println("Square perimeter is " + this.square_perimeter());
        System.out.println("Square area is " + this.square_area());
    }

    public double square_perimeter() {
        double perimeter;
        perimeter = 2 * Math.sqrt(2) * diagonal.get_length();
        return perimeter;
    }

    public double square_area() {
        double area;
        area = Math.pow(diagonal.get_length(), 2) / 2;
        return area;
    }

}
