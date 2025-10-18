package Decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedBorderDecorator(circle);
        redCircle.draw();
    }
}
