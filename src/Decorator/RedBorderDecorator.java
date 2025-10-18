package Decorator;

import java.awt.*;

class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        decoratedShape.draw();
        System.out.println("Add Red Border");
    }
}
