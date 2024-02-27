package Demo;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 5.0);
        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);
        System.out.println("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
    }
}