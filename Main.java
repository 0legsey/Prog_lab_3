import java.util.Scanner;
public class Main {

    public static int dynamic_variables() {
        Scanner in = new Scanner(System.in);
        Point point = new Point();
        Segment segment = new Segment();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        int answer;
        System.out.println("\nSelect the shape whose parameters you want to calculate:");
        System.out.println("1) Point\n2) Segment\n3) Circle\n4) Square\n5) Triangle\n6) Return to the menu");
        do {
            System.out.println("Answer: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 6);
        switch (answer) {
            case 1: {
                point.input();
                System.out.println("Point coordinates: ");
                point.output();
                break;
            }
            case 2: {
                segment.input();
                segment.output();
                break;
            }
            case 3: {
                circle.input();
                circle.output();
                break;
            }
            case 4: {
                square.input();
                square.output();
                break;
            }
            case 5: {
                triangle.input();
                triangle.output();
                break;
            }
            case 6: {
                return 0;
            }
        }
        dynamic_variables();
        return 0;
    }

    public static int menu(){
        int answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Select the program operation mode:");
        System.out.println("1) Working with Class Objects\n2) Exit the programm");
        do {
            System.out.println("Answer: ");
            answer = in.nextInt();
        } while (answer < 1 || answer > 2);
        switch (answer) {
            case 1: dynamic_variables(); break;
            case 2: return 0;
        }
        menu();
        return 0;
    }
    public static void main(String[] args) {
        System.setProperty("file.encoding","1251");
        menu();
    }
}
