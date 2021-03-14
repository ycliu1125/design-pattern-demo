package structural.facade;

public class ShapeMaker {

    private Shape circle;
    private Shape triangle;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        triangle = new Triangle();
        rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
