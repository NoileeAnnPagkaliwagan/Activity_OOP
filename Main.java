public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(9.0, "orange", true);
        Shape rectangle = new Rectangle(5.0, 7.0, "green", false);
        Shape square = new Square(6.0, "blue", true);

        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
    }
}